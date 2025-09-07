import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MilenguajeInterpreter {
    
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Uso: java MilenguajeInterpreter <archivo.mil>");
            System.exit(1);
        }
        
        String nombreArchivo = args[0];
        
        try {
            // Leer el archivo de código fuente
            String codigoFuente = new String(Files.readAllBytes(Paths.get(nombreArchivo)));
            
            // Ejecutar el intérprete
            ejecutar(codigoFuente, nombreArchivo);
            
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            System.err.println("Error durante la ejecución: " + e.getMessage());
            System.exit(1);
        }
    }
    
    public static void ejecutar(String codigoFuente, String nombreArchivo) {
        try {
            // Crear el input stream
            ANTLRInputStream input = new ANTLRInputStream(codigoFuente);
            
            // Crear el lexer
            MilenguajeLexer lexer = new MilenguajeLexer(input);
            lexer.removeErrorListeners(); // Remover listeners por defecto
            lexer.addErrorListener(new MilenguajeErrorListener());
            
            // Crear el stream de tokens
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // Crear el parser
            MilenguajeParser parser = new MilenguajeParser(tokens);
            parser.removeErrorListeners(); // Remover listeners por defecto
            parser.addErrorListener(new MilenguajeErrorListener());
            
            // Parsear el código
            ParseTree tree = parser.codigo();
            
            // Verificar si hubo errores de sintaxis
            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.err.println("\nNo se puede ejecutar el programa debido a errores de sintaxis.");
                return;
            }
            
            System.out.println("=== Ejecutando " + nombreArchivo + " ===");
            
            // Crear y ejecutar el evaluador semántico
            MilenguajeEvaluator evaluator = new MilenguajeEvaluator();
            evaluator.visit(tree);
            
            System.out.println("\n=== Ejecución completada ===");
            
        } catch (RecognitionException e) {
            System.err.println("Error de reconocimiento: " + e.getMessage());
        } catch (RuntimeException e) {
            System.err.println("Error en tiempo de ejecución: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    // Método para ejecutar código directamente desde string (útil para testing)
    public static void ejecutarCodigo(String codigo) {
        ejecutar(codigo, "código directo");
    }
}