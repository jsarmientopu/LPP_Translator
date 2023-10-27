grammar LPPLenguage;

init: (procedure)* 'inicio' (commands)+ 'fin';


procedure:  PROC ID ('(' (VAR)? TYPE (arr_cad)? ID (proc_params)* ')')? init;
proc_params:COMMA (VAR)? TYPE (arr_cad)? ID;
arr_cad:    '['( INT | ID )( ',' ( INT | ID ) )*']';
function:   FUNCTION ID ('(' TYPE (arr_cad)? ID (proc_params)* ')')? 'inicio' (commands)+ RETURN exp 'fin';
commands:   if
            | while
            | repeat
            | for
            | 'no'
            | STR;
if:         IF exp 'entonces' (commands)+ (ELSE (commands)+)? 'fin si';
case:       CASE ID ;
while:      WHILE exp 'haga' (commands)+ 'fin mientras';
repeat:     REPEAT (commands)+ 'hasta' exp;
for:        FOR ID ASSGN INT 'hasta' INT 'haga' (commands)+ 'fin para';
exp: 'a';

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
ASSGN: '<-';
REAL: [0-9]+.[0-9]+;
INT: [0-9]+;
COMMA: ',';
STR: '"' ('\\' ["\\] | ~["\\\r\n])* '"' ;
ID: [a-zA-Z_][a-zA-Z0-9_]*;
ESP : [ \t\r\n]+ -> skip ;
