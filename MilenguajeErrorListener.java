import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Nullable;

public class MilenguajeErrorListener extends BaseErrorListener {
    
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                           @Nullable Object offendingSymbol,
                           int line,
                           int charPositionInLine,
                           String msg,
                           @Nullable RecognitionException e) {
        
        // Personalizar mensajes de error en español
        String mensajePersonalizado = personalizarMensaje(msg, offendingSymbol);
        
        System.err.println("Error de sintaxis en línea " + line + 
                          ", posición " + charPositionInLine + ": " + 
                          mensajePersonalizado);
        
        // Mostrar la línea problemática si es posible
        if (recognizer instanceof Parser) {
            Parser parser = (Parser) recognizer;
            TokenStream tokens = parser.getInputStream();
            String input = tokens.getTokenSource().getInputStream().toString();
            String[] lines = input.split("\n");
            
            if (line - 1 < lines.length) {
                System.err.println("  " + lines[line - 1]);
                
                // Mostrar un indicador en la posición del error
                StringBuilder indicator = new StringBuilder("  ");
                for (int i = 0; i < charPositionInLine; i++) {
                    indicator.append(" ");
                }
                indicator.append("^");
                System.err.println(indicator.toString());
            }
        }
    }
    
    private String personalizarMensaje(String mensajeOriginal, Object simboloProblematico) {
        // Convertir mensajes comunes de ANTLR al español
        if (mensajeOriginal.contains("missing")) {
            if (mensajeOriginal.contains("';'")) {
                return "Se esperaba un punto y coma (;)";
            } else if (mensajeOriginal.contains("'}'")) {
                return "Se esperaba una llave de cierre (})";
            } else if (mensajeOriginal.contains("'{'")) {
                return "Se esperaba una llave de apertura ({)";
            } else if (mensajeOriginal.contains("')'")) {
                return "Se esperaba un paréntesis de cierre ())";
            } else if (mensajeOriginal.contains("'('")) {
                return "Se esperaba un paréntesis de apertura (()";
            }
            return "Falta un símbolo esperado";
        }
        
        if (mensajeOriginal.contains("extraneous input")) {
            return "Símbolo inesperado: " + (simboloProblematico != null ? simboloProblematico.toString() : "");
        }
        
        if (mensajeOriginal.contains("no viable alternative")) {
            return "Expresión o instrucción no válida";
        }
        
        if (mensajeOriginal.contains("mismatched input")) {
            return "Símbolo incorrecto en esta posición: " + 
                   (simboloProblematico != null ? simboloProblematico.toString() : "");
        }
        
        // Si no podemos personalizar, devolver el mensaje original
        return mensajeOriginal;
    }
}