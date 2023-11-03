grammar LPPLenguage;

init: (register)* (declaration)* (procedure | function)* 'inicio' (commands)* 'fin';

register: 'registro' ID (declaration)+ 'fin registro';
declaration:    TYPE (arr_cad_aux)* ID (COMMA ID)*
                | ID ID (COMMA ID)*;
procedure:  PROC ID proc_declaration? (declaration)* 'inicio' (commands)* 'fin';
proc_declaration: ('(' (VAR)? TYPE (arr_cad)* ID (proc_params)* ')');
proc_params: COMMA (VAR)? TYPE (arr_cad)* ID;
params:      COMMA (val | ID);
arr_cad_aux:'['( INT )( ',' ( INT ) )*']';
arr_cad:    '['( INT )( ',' ( INT ) )*']';
function:   FUNCTION ID proc_declaration? (declaration)* 'inicio' (commands)* RETURN exp 'fin';
commands:   if
            | while
            | repeat
            | for
            | case
            | assign
            | read
            | write
            | llamar
            | lineBreak;
if:         IF condition 'entonces' (commands)* (else (commands)*)? 'fin si';
condition:  expRel_;
else:       'sino';
case:       CASE ID (val (COMMA val)* ':' (commands)*) (case__)* else ':' (commands)* 'fin caso' ;
case__:      val (COMMA val)* ':' (commands)*;
while:      WHILE condition 'haga' (commands)+ 'fin mientras';
repeat:     REPEAT (commands)* until condition;
until:      'hasta';
for:        FOR ID ASSGN INT 'hasta' INT 'haga' (commands)* 'fin para';
assign:     ID '<-' exp;
read:       'lea' ID (',' ID)*;
write:      'escriba' ( expArt_ | expRel_ | val ) ( comma ( expArt_ | expRel_ | val ) )*;
llamar :    'llamar' ID (lpar (val | ID) (params)* rpar)?;
lineBreak:  'llamar' 'nueva_linea';
exp: expArt | expRel;
expArt: expArt_;
expArt_ : expArt_ expArtAux
          | lpar expArt_ rpar
          | val;
expArtAux: ARTOP expArt_;
expRel: expRel_;
expRel_ :expRel_ expRelAux
         | lpar expRel_ rpar
         | expComp
         | expArt_;
lpar: '(';
rpar: ')';
expRelAux : LOGOP expRel_;
expComp:expArt_ expComp_;
expComp_: RELOP expArt_;
comma: ',';
val:  ID | REAL | INT | CHR | STR ;



COMMENT : '/*' .*? '*/' -> skip ;
LINE_COMMENT: '//' ~[\r\n]* -> skip ;
PROC: 'procedimiento';
VAR: 'var';
TYPE: ('entero'|'real'|'booleano'|'caracter'|'cadena');
IF: 'si';
WHILE: 'mientras';
REPEAT: 'repita';
FOR: 'para';
FUNCTION: 'funcion';
RETURN: 'retorne';
CASE: 'caso';
COMMA: ',';
ASSGN: '<-';
REAL: [0-9]+.[0-9]+;
INT: [0-9]+;
ARTOP:  '^' | '+' | '-' | '*' | '/' | 'div' | 'mod' ;
LOGOP:  'y' | 'o' ;
RELOP:  '=' | '<' | '>' | '<=' | '>=' | '<>' ;
STR: '"' ('\\' ["\\] | ~["\\\r\n])* '"' ;
CHR: '\'' (~[']) '\'' ;
ID: [a-zA-Z_][a-zA-Z0-9_]*;
ESP : [ \t\r\n]+ -> skip ;
