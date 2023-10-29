grammar LPPLenguage;

init: (register)* (declaration)* (procedure | function)* 'inicio' (commands)+ 'fin';

register: 'registro' ID (declaration)+ 'fin registro';
declaration:    TYPE (arr_cad)? ID (COMMA ID)*
                | ID ID;
procedure:  PROC ID ('(' (VAR)? TYPE (arr_cad)? ID (proc_params)* ')')? init;
proc_params:COMMA (VAR)? TYPE (arr_cad)? ID;
arr_cad:    '['( INT | ID )( ',' ( INT | ID ) )*']';
function:   FUNCTION ID ('(' TYPE (arr_cad)? ID (proc_params)* ')')? 'inicio' (commands)+ RETURN exp 'fin';
commands:   if
            | while
            | repeat
            | for
            | case
            | assign
            | read
            | write
            | lineBreak;
if:         IF expRel 'entonces' (commands)+ (ELSE (commands)+)? 'fin si';
case:       CASE ID (VAL (COMMA VAL)* ':' (commands)+)+ 'sino :' (commands)+ 'fin caso' ;
while:      WHILE expRel 'haga' (commands)+ 'fin mientras';
repeat:     REPEAT (commands)+ 'hasta' expRel;
for:        FOR ID ASSGN INT 'hasta' INT 'haga' (commands)+ 'fin para';
assign:     ID '<-' exp;
read:       'lea' ID (',' ID)*;
write:      'escriba' ( exp | VAL ) ( ',' ( exp | VAL ) )*;
lineBreak:  'llamar' 'nueva_linea';
exp: expArt | expRel;
expArt: expArt ARTOP expArt
        | '(' expArt ')'
        | VAL;
expRel: expRel LOGOP expRel
        | '(' expRel ')'
        | expComp
        | expArt;
expComp:expArt RELOP expArt;


COMMENT : '/*' .*? '*/' -> skip ;
LINE_COMMENT: '//' ~[\r\n]* -> skip ;
PROC: 'procedimiento';
VAR: 'var';
TYPE: ('entero'|'real'|'booleano'|'caracter'|'cadena');
IF: 'si';
ELSE: 'sino';
WHILE: 'mientras';
REPEAT: 'repita';
FOR: 'para';
FUNCTION: 'funcion';
RETURN: 'retorne';
CASE: 'caso';
ASSGN: '<-';
REAL: [0-9]+.[0-9]+;
INT: [0-9]+;
COMMA: ',';
ARTOP: ( '^' | '+' | '-' | '*' | '/' | 'div' | 'mod' );
LOGOP: ( 'y' | 'o' );
RELOP: ( '=' | '<' | '>' | '<=' | '>=' | '<>' );
STR: '"' ('\\' ["\\] | ~["\\\r\n])* '"' ;
CHR: '\'' (~[']) '\'' ;
ID: [a-zA-Z_][a-zA-Z0-9_]*;
VAL: ( ID | REAL | INT | CHR | STR );
ESP : [ \t\r\n]+ -> skip ;
