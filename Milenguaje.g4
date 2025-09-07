grammar Milenguaje;


/************************************************************************************************************
* Reglas de Parser (minusculas)                                                                             *
*************************************************************************************************************/


codigo: (declrFun | instruccion)+; //El programa completo se compone de lineas (instrucciones) o de funciones (con instrucciones). Puede tener una sola o mas.

instruccion: //Insrucciones permitidas
    declrVar';'
    | asigVar ';'
    | llamarFun ';'
    | instrIf
    | instrFor
    | instrWhile
    | instrReturn
    ;

declrVar: tipo IDENTIFICADOR ('=' expresion)?; //Uso: entero x = 2; O entero $y;
asigVar: IDENTIFICADOR ASIGN expresion; //Uso: $y = 3;
parametros: parametro (',' parametro)*;
parametro: tipo IDENTIFICADOR;

//==========================================Estructuras de control================================
instrIf: SI '(' expresion ')' '{' instruccion+ '}' (SINO '{' instruccion+ '}')?; //If de tipo C. Ojo, dentro van lineas (instrucciones) para que se pueda p. ej. anidar if.
instrFor: PARA '(' (declrVar | asigVar)? ';' expresion ';' asigVar? ')' '{' instruccion+ '}';
instrWhile: MIENTRAS '(' expresion ')' '{' instruccion+ '}';
instrReturn: RETORNAR expresion? ';';
declrFun: tipo IDENTIFICADOR '(' parametros? ')' '{' instruccion+ '}';
llamarFun: IDENTIFICADOR '(' (expresion (',' expresion)*)? ')'; //Se llama a una funcion con 0 o mas parametros (como expresion), separados por comas.
//================================================================================================

expresion: exprLogico ;  
    exprLogico: exprAnd (LOGOR exprAnd)*;
    exprAnd: exprIgualdad (LOGAND exprIgualdad)*;
    exprIgualdad: exprRel ((IGUAL|DIFERENTE) exprRel )*;
    exprRel: exprSuma ((MAYORQUE|MENORQUE|MENORIGUAL|MAYORIGUAL) exprSuma)*;
    exprSuma: exprMult ((MAS|MENOS) exprMult)*; 
    exprMult: exprPot ((MULTIPLICADO|DIVIDIDO|MODULO) exprPot)*; 
    exprPot: exprUn (POTENCIADO exprUn)*;
    exprUn: (LOGNOT | MENOS)* exprResto;
    exprResto: 
        '('expresion')'
        |llamarFun
        |IDENTIFICADOR
        |ENTERO
        |FLOTANTE
        |CADENA
        |BOOLEANO;



tipo: T_BOOLEANO | T_ENTERO | T_FLOTANTE | T_CADENA;


/***********************************************************************************************************
* Reglas de Lexer (en mayusculas por convencion) (importante prioridad de arriba a abajo)                  *
************************************************************************************************************/

//=========================================Tipos de datos=========================================
BOOLEANO: "verdadero" | "falso"; // Debe ser exactamente "verdadero" o "falso". Va de primero para que no se tome como IDENTIFICADOR.
IDENTIFICADOR: [a-zA-Z_][a-zA-Z0-9_]{0,9}; // Debe iniciar por letra, guion bajo. Luego cualquier caracter alfanumerico o guion bajo. Max 10 caracteres.
FLOTANTE: [0-9]+ '.' [0-9]+; //Uno o mas numeros seguidos de punto y uno o mas decimales.
ENTERO: [0-9]+; //Uno o mas numeros del 0 al 9
CADENA: '"' (~["\\] | '\\' .)* '"'; // Inicia y termina por doble comilla, se repite 0+ veces. No se permite usar comillas dobles dentro ni el backslash sin caracter a escapar.

//==========================================Estructuras de control================================
SI: 'si';
SINO: 'sino';
PARA: 'para';
MIENTRAS: 'mientras';

//==========================================Operadores================================
//#######Aritmeticos########
MAS: '+';
MENOS: '-';
POTENCIADO: '**';
MULTIPLICADO: '*';
DIVIDIDO: '/';
MODULO: '%';

//########Comparacion#########
IGUAL: '==';
DIFERENTE: '!=';
MENORQUE: '<';
MENORIGUAL: '<=';
MAYORQUE: '>';
MAYORIGUAL: '>=';

//########Logicos##########
LOGAND: '&&';
LOGOR: '||';
LOGNOT: '!';

//########Asignacion########
ASIGN: '=';

//########Operaciones de bits#######
BITAND: '&';
BITOR: '|';
BITNOT: '~';
BITXOR: '^';
BITLSHIFT: '<<';
BITRSHIFT: '>>';

//==========================================Palabras Reservadas================================
T_BOOLEANO: 'booleano';
T_ENTERO: 'entero';
T_FLOTANTE: 'flotante';
T_CADENA: 'cadena';
RETORNAR: 'retornar';

//==========================================Utilidades============================================
WS: [ \t\r\n]+ -> skip; //A ignorar: espacios, retorno de carrete y salto de linea
