import java.util.*;

public class MilenguajeEvaluator extends MilenguajeBaseVisitor<Object> {
    // Tabla de símbolos para variables
    private Map<String, Object> variables = new HashMap<>();
    // Tabla de símbolos para funciones
    private Map<String, MilenguajeParser.DeclrFunContext> funciones = new HashMap<>();
    // Stack para manejar scopes de funciones
    private Stack<Map<String, Object>> scopeStack = new Stack<>();
    // Valor de retorno de funciones
    private Object returnValue = null;
    private boolean hasReturned = false;

    @Override
    public Object visitCodigo(MilenguajeParser.CodigoContext ctx) {
        // Primero registrar todas las funciones
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof MilenguajeParser.DeclrFunContext) {
                MilenguajeParser.DeclrFunContext funCtx = (MilenguajeParser.DeclrFunContext) ctx.getChild(i);
                funciones.put(funCtx.IDENTIFICADOR().getText(), funCtx);
            }
        }
        
        // Luego ejecutar las instrucciones principales
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof MilenguajeParser.InstruccionContext) {
                visit(ctx.getChild(i));
            }
        }
        return null;
    }

    private void Longitud(String id) {
        if (id.length() > 10) {
            throw new RuntimeException("Identificador demasiado largo (max 10): " + id);
        }
    }


    @Override
    public Object visitDeclrVar(MilenguajeParser.DeclrVarContext ctx) {
        String nombre = ctx.IDENTIFICADOR().getText();
        Longitud(nombre);
        String tipo = ctx.tipo().getText();
        Object valor = null;
        
        if (ctx.expresion() != null) {
            valor = visit(ctx.expresion());
        } else {
            // Valores por defecto
            switch (tipo) {
                case "entero":
                    valor = 0;
                    break;
                case "flotante":
                    valor = 0.0;
                    break;
                case "booleano":
                    valor = false;
                    break;
                case "cadena":
                    valor = "";
                    break;
            }
        }
        
        // Verificar que el tipo coincida
        if (!verificarTipo(valor, tipo)) {
            throw new RuntimeException("Error de tipo en variable " + nombre);
        }
        
        getCurrentScope().put(nombre, valor);
        return null;
    }

    @Override
    public Object visitAsigVar(MilenguajeParser.AsigVarContext ctx) {
        String nombre = ctx.IDENTIFICADOR().getText();
        Object valor = visit(ctx.expresion());
        
        // Buscar la variable en todos los scopes
        if (getCurrentScope().containsKey(nombre)) {
            getCurrentScope().put(nombre, valor);
        } else {
            throw new RuntimeException("Variable no declarada: " + nombre);
        }
        return null;
    }

    @Override
    public Object visitInstrIf(MilenguajeParser.InstrIfContext ctx) {
        Object condicion = visit(ctx.expresion());
        
        if (!(condicion instanceof Boolean)) {
            throw new RuntimeException("La condición del if debe ser booleana");
        }
        
        if ((Boolean) condicion) {
            // Ejecutar bloque del if
            List<MilenguajeParser.InstruccionContext> instrucciones = ctx.instruccion();
            int sinoIndex = encontrarIndiceSino(ctx);
            
            for (int i = 0; i < (sinoIndex != -1 ? sinoIndex : instrucciones.size()); i++) {
                visit(instrucciones.get(i));
                if (hasReturned) break;
            }
        } else if (ctx.SINO() != null) {
            // Ejecutar bloque del else
            List<MilenguajeParser.InstruccionContext> instrucciones = ctx.instruccion();
            int sinoIndex = encontrarIndiceSino(ctx);
            
            if (sinoIndex != -1) {
                for (int i = sinoIndex; i < instrucciones.size(); i++) {
                    visit(instrucciones.get(i));
                    if (hasReturned) break;
                }
            }
        }
        return null;
    }

    private int encontrarIndiceSino(MilenguajeParser.InstrIfContext ctx) {
        if (ctx.SINO() == null) return -1;
        
        // Contar las llaves para encontrar donde termina el if y empieza el else
        String texto = ctx.getText();
        int llaveCount = 0;
        int sinoPos = texto.indexOf("sino");
        
        if (sinoPos == -1) return -1;
        
        // Contar instrucciones hasta el sino basado en la estructura
        List<MilenguajeParser.InstruccionContext> instrucciones = ctx.instruccion();
        return instrucciones.size() / 2; // Aproximación simple
    }

    @Override
    public Object visitInstrFor(MilenguajeParser.InstrForContext ctx) {
        // Crear nuevo scope para el for
        pushScope();
        
        try {
            // Inicialización
            if (ctx.declrVar() != null) {
                visit(ctx.declrVar());
            } else if (ctx.asigVar().size() > 0) {
                visit(ctx.asigVar(0));
            }
            
            // Condición y loop
            while (true) {
                Object condicion = visit(ctx.expresion());
                if (!(condicion instanceof Boolean) || !(Boolean) condicion) {
                    break;
                }
                
                // Ejecutar cuerpo del for
                for (MilenguajeParser.InstruccionContext instr : ctx.instruccion()) {
                    visit(instr);
                    if (hasReturned) break;
                }
                
                if (hasReturned) break;
                
                // Incremento
                if (ctx.asigVar().size() > 1) {
                    visit(ctx.asigVar(1));
                } else if (ctx.asigVar().size() == 1 && ctx.declrVar() != null) {
                    visit(ctx.asigVar(0));
                }
            }
        } finally {
            popScope();
        }
        
        return null;
    }

    @Override
    public Object visitInstrWhile(MilenguajeParser.InstrWhileContext ctx) {
        while (true) {
            Object condicion = visit(ctx.expresion());
            if (!(condicion instanceof Boolean) || !(Boolean) condicion) {
                break;
            }
            
            for (MilenguajeParser.InstruccionContext instr : ctx.instruccion()) {
                visit(instr);
                if (hasReturned) break;
            }
            
            if (hasReturned) break;
        }
        return null;
    }

    @Override
    public Object visitInstrReturn(MilenguajeParser.InstrReturnContext ctx) {
        if (ctx.expresion() != null) {
            returnValue = visit(ctx.expresion());
        } else {
            returnValue = null;
        }
        hasReturned = true;
        return returnValue;
    }

    @Override
    public Object visitLlamarFun(MilenguajeParser.LlamarFunContext ctx) {
        String nombreFun = ctx.IDENTIFICADOR().getText();
        
        // Función especial para imprimir
        if (nombreFun.equals("imprimir")) {
            if (ctx.expresion() != null && ctx.expresion().size() > 0) {
                Object valor = visit(ctx.expresion(0));
                System.out.println(valor.toString());
            }
            return null;
        }
        
        if (!funciones.containsKey(nombreFun)) {
            throw new RuntimeException("Función no declarada: " + nombreFun);
        }
        
        MilenguajeParser.DeclrFunContext funDef = funciones.get(nombreFun);
        
        // Crear nuevo scope para la función
        pushScope();
        
        try {
            // Evaluar argumentos
            List<Object> argumentos = new ArrayList<>();
            if (ctx.expresion() != null) {
                for (MilenguajeParser.ExpresionContext arg : ctx.expresion()) {
                    argumentos.add(visit(arg));
                }
            }
            
            // Asignar parámetros
            if (funDef.parametros() != null) {
                List<MilenguajeParser.ParametroContext> params = funDef.parametros().parametro();
                if (params.size() != argumentos.size()) {
                    throw new RuntimeException("Número incorrecto de argumentos para función " + nombreFun);
                }
                
                for (int i = 0; i < params.size(); i++) {
                    String paramName = params.get(i).IDENTIFICADOR().getText();
                    getCurrentScope().put(paramName, argumentos.get(i));
                }
            }
            
            // Ejecutar cuerpo de la función
            returnValue = null;
            hasReturned = false;
            
            for (MilenguajeParser.InstruccionContext instr : funDef.instruccion()) {
                visit(instr);
                if (hasReturned) break;
            }
            
            return returnValue;
            
        } finally {
            popScope();
            hasReturned = false;
        }
    }

    // Métodos para expresiones
    @Override
    public Object visitExpresion(MilenguajeParser.ExpresionContext ctx) {
        return visit(ctx.exprLogico());
    }

    @Override
    public Object visitExprLogico(MilenguajeParser.ExprLogicoContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visit(ctx.exprAnd(0));
        }
        
        Object izq = visit(ctx.exprAnd(0));
        for (int i = 1; i < ctx.exprAnd().size(); i++) {
            // Evaluación perezosa para OR
            if (izq instanceof Boolean && (Boolean) izq) {
                return true;
            }
            Object der = visit(ctx.exprAnd(i));
            izq = or(izq, der);
        }
        return izq;
    }

    @Override
    public Object visitExprAnd(MilenguajeParser.ExprAndContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visit(ctx.exprIgualdad(0));
        }
        
        Object izq = visit(ctx.exprIgualdad(0));
        for (int i = 1; i < ctx.exprIgualdad().size(); i++) {
            // Evaluación perezosa para AND
            if (izq instanceof Boolean && !(Boolean) izq) {
                return false;
            }
            Object der = visit(ctx.exprIgualdad(i));
            izq = and(izq, der);
        }
        return izq;
    }

    @Override
    public Object visitExprIgualdad(MilenguajeParser.ExprIgualdadContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visit(ctx.exprRel(0));
        }
        
        Object izq = visit(ctx.exprRel(0));
        for (int i = 1; i < ctx.exprRel().size(); i++) {
            Object der = visit(ctx.exprRel(i));
            String op = ctx.getChild(2 * i - 1).getText();
            
            if (op.equals("==")) {
                izq = igual(izq, der);
            } else if (op.equals("!=")) {
                izq = diferente(izq, der);
            }
        }
        return izq;
    }

    @Override
    public Object visitExprRel(MilenguajeParser.ExprRelContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visit(ctx.exprSuma(0));
        }
        
        Object izq = visit(ctx.exprSuma(0));
        for (int i = 1; i < ctx.exprSuma().size(); i++) {
            Object der = visit(ctx.exprSuma(i));
            String op = ctx.getChild(2 * i - 1).getText();
            
            switch (op) {
                case ">":
                    izq = mayor(izq, der);
                    break;
                case "<":
                    izq = menor(izq, der);
                    break;
                case ">=":
                    izq = mayorIgual(izq, der);
                    break;
                case "<=":
                    izq = menorIgual(izq, der);
                    break;
            }
        }
        return izq;
    }

    @Override
    public Object visitExprSuma(MilenguajeParser.ExprSumaContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visit(ctx.exprMult(0));
        }
        
        Object izq = visit(ctx.exprMult(0));
        for (int i = 1; i < ctx.exprMult().size(); i++) {
            Object der = visit(ctx.exprMult(i));
            String op = ctx.getChild(2 * i - 1).getText();
            
            if (op.equals("+")) {
                izq = sumar(izq, der);
            } else if (op.equals("-")) {
                izq = restar(izq, der);
            }
        }
        return izq;
    }

    @Override
    public Object visitExprMult(MilenguajeParser.ExprMultContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visit(ctx.exprPot(0));
        }
        
        Object izq = visit(ctx.exprPot(0));
        for (int i = 1; i < ctx.exprPot().size(); i++) {
            Object der = visit(ctx.exprPot(i));
            String op = ctx.getChild(2 * i - 1).getText();
            
            switch (op) {
                case "*":
                    izq = multiplicar(izq, der);
                    break;
                case "/":
                    izq = dividir(izq, der);
                    break;
                case "%":
                    izq = modulo(izq, der);
                    break;
            }
        }
        return izq;
    }

    @Override
    public Object visitExprPot(MilenguajeParser.ExprPotContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visit(ctx.exprUn(0));
        }
        
        // Potencia es asociativa por la derecha
        Object base = visit(ctx.exprUn(0));
        for (int i = 1; i < ctx.exprUn().size(); i++) {
            Object exp = visit(ctx.exprUn(i));
            base = potencia(base, exp);
        }
        return base;
    }

    @Override
    public Object visitExprUn(MilenguajeParser.ExprUnContext ctx) {
        if (ctx.exprResto() != null) {
            Object valor = visit(ctx.exprResto());
            
            // Aplicar operadores unarios de derecha a izquierda
            for (int i = ctx.getChildCount() - 2; i >= 0; i--) {
                String op = ctx.getChild(i).getText();
                if (op.equals("-")) {
                    valor = negar(valor);
                } else if (op.equals("!")) {
                    valor = not(valor);
                }
            }
            return valor;
        }
        return null;
    }

    @Override
    public Object visitExprResto(MilenguajeParser.ExprRestoContext ctx) {
        if (ctx.expresion() != null) {
            return visit(ctx.expresion());
        } else if (ctx.llamarFun() != null) {
            return visit(ctx.llamarFun());
        } else if (ctx.IDENTIFICADOR() != null) {
            String nombre = ctx.IDENTIFICADOR().getText();
            Object valor = getVariable(nombre);
            if (valor == null) {
                throw new RuntimeException("Variable no declarada: " + nombre);
            }
            return valor;
        } else if (ctx.ENTERO() != null) {
            return Integer.parseInt(ctx.ENTERO().getText());
        } else if (ctx.FLOTANTE() != null) {
            return Double.parseDouble(ctx.FLOTANTE().getText());
        } else if (ctx.CADENA() != null) {
            String cadena = ctx.CADENA().getText();
            return cadena.substring(1, cadena.length() - 1); // Remover comillas
        } else if (ctx.BOOLEANO() != null) {
            return ctx.BOOLEANO().getText().equals("verdadero");
        }
        return null;
    }

    // Métodos auxiliares
    private void pushScope() {
        scopeStack.push(new HashMap<>(variables));
    }

    private void popScope() {
        if (!scopeStack.isEmpty()) {
            variables = scopeStack.pop();
        }
    }

    private Map<String, Object> getCurrentScope() {
        return variables;
    }

    private Object getVariable(String nombre) {
        return variables.get(nombre);
    }

    private boolean verificarTipo(Object valor, String tipo) {
        switch (tipo) {
            case "entero":
                return valor instanceof Integer;
            case "flotante":
                return valor instanceof Double;
            case "booleano":
                return valor instanceof Boolean;
            case "cadena":
                return valor instanceof String;
            default:
                return false;
        }
    }

    // Operaciones aritméticas
    private Object sumar(Object a, Object b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (Integer) a + (Integer) b;
        } else if (a instanceof Number && b instanceof Number) {
            return ((Number) a).doubleValue() + ((Number) b).doubleValue();
        } else if (a instanceof String && b instanceof String) {
            return (String) a + (String) b;
        }
        throw new RuntimeException("Operación de suma no válida");
    }

    private Object restar(Object a, Object b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (Integer) a - (Integer) b;
        } else if (a instanceof Number && b instanceof Number) {
            return ((Number) a).doubleValue() - ((Number) b).doubleValue();
        }
        throw new RuntimeException("Operación de resta no válida");
    }

    private Object multiplicar(Object a, Object b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (Integer) a * (Integer) b;
        } else if (a instanceof Number && b instanceof Number) {
            return ((Number) a).doubleValue() * ((Number) b).doubleValue();
        }
        throw new RuntimeException("Operación de multiplicación no válida");
    }

    private Object dividir(Object a, Object b) {
        if (a instanceof Number && b instanceof Number) {
            double divisor = ((Number) b).doubleValue();
            if (divisor == 0) {
                throw new RuntimeException("División por cero");
            }
            return ((Number) a).doubleValue() / divisor;
        }
        throw new RuntimeException("Operación de división no válida");
    }

    private Object modulo(Object a, Object b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (Integer) a % (Integer) b;
        }
        throw new RuntimeException("Operación de módulo no válida");
    }

    private Object potencia(Object a, Object b) {
        if (a instanceof Number && b instanceof Number) {
            return Math.pow(((Number) a).doubleValue(), ((Number) b).doubleValue());
        }
        throw new RuntimeException("Operación de potencia no válida");
    }

    // Operaciones de comparación
    private Object igual(Object a, Object b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return a.equals(b);
    }

    private Object diferente(Object a, Object b) {
        return !(Boolean) igual(a, b);
    }

    private Object mayor(Object a, Object b) {
        if (a instanceof Number && b instanceof Number) {
            return ((Number) a).doubleValue() > ((Number) b).doubleValue();
        }
        throw new RuntimeException("Operación de comparación no válida");
    }

    private Object menor(Object a, Object b) {
        if (a instanceof Number && b instanceof Number) {
            return ((Number) a).doubleValue() < ((Number) b).doubleValue();
        }
        throw new RuntimeException("Operación de comparación no válida");
    }

    private Object mayorIgual(Object a, Object b) {
        if (a instanceof Number && b instanceof Number) {
            return ((Number) a).doubleValue() >= ((Number) b).doubleValue();
        }
        throw new RuntimeException("Operación de comparación no válida");
    }

    private Object menorIgual(Object a, Object b) {
        if (a instanceof Number && b instanceof Number) {
            return ((Number) a).doubleValue() <= ((Number) b).doubleValue();
        }
        throw new RuntimeException("Operación de comparación no válida");
    }

    // Operaciones unarias
    private Object negar(Object a) {
        if (a instanceof Integer) {
            return -(Integer) a;
        } else if (a instanceof Double) {
            return -(Double) a;
        }
        throw new RuntimeException("Operación de negación no válida");
    }

    private Object not(Object a) {
        if (a instanceof Boolean) {
            return !(Boolean) a;
        }
        throw new RuntimeException("Operación NOT no válida");
    }

    // Operaciones lógicas
    private Object and(Object a, Object b) {
        if (a instanceof Boolean && b instanceof Boolean) {
            return (Boolean) a && (Boolean) b;
        }
        throw new RuntimeException("Operación AND no válida");
    }

    private Object or(Object a, Object b) {
        if (a instanceof Boolean && b instanceof Boolean) {
            return (Boolean) a || (Boolean) b;
        }
        throw new RuntimeException("Operación OR no válida");
    }
}