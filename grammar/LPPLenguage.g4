grammar LPPLenguage;

init: (register)* (declaration)* (procedure | function)* INICIO (commands)* FIN;
register: REGISTRO ID (declaration)+ FIN REGISTRO;
declaration:    TYPE (arr_cad_aux)* ID (COMMA ID)*
                | ID ID (COMMA ID)*
                | ARREGLO dim_arr DE type_arr ID;
type_arr:   TYPE | (ARREGLO dim_arr DE type_arr);
dim_arr:    '[' INT (comma INT)* ']';
procedure:  PROC ID proc_declaration? (declaration)* INICIO (commands)* FIN;
proc_declaration: ('(' (VAR)? TYPE (arr_cad)* ID (proc_params)* ')');
proc_params: COMMA (VAR)? TYPE (arr_cad)* ID;
params:      COMMA (val | ID);
arr_cad_aux:'[' INT ( COMMA INT )*']';
arr_cad:    '[' INT ( COMMA INT )*']';
function:   FUNCTION ID proc_declaration? ':' (TYPE ('[' INT ( COMMA INT )*']')* )? (declaration)* INICIO (commands)* return FIN;
return:     RETURN val_return;
val_return: exp;
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
if:         IF condition ENTONCES (commands)* (else (commands)*)? FIN IF;
condition:  expRel_;
else:       SINO;
case:       CASE ID (val (COMMA val)* ':' (commands)*) (case__)* else ':' (commands)* FIN CASE;
case__:      val (COMMA val)* ':' (commands)*;
while:      WHILE condition HAGA (commands)+ FIN WHILE;
repeat:     REPEAT (commands)* until condition;
until:      HASTA;
for:        FOR ID ASSGN init_for HASTA end_for HAGA (commands)* FIN FOR;
init_for:   expArt;
end_for:    expArt;
write:      ESCRIBA ( expArt_ | expRel_ ) ( comma ( expArt_ | expRel_ ) )*;
assign:     ID index_arr '<-' exp;
read:       LEA ID (',' ID)*;
llamar :    LLAMAR ID (lpar (val | ID) (params)* rpar)?;
lineBreak:  LLAMAR NUEVA_LINEA;
exp: expArt | expRel;
expArt: expArt_;
expArt_ : expArt_ expArtAux
          | lpar expArt_ rpar
          | val (lpar (exp (comma exp)*)? rpar)? index_arr;
expArtAux: ARTOP expArt_;
expRel: expRel_;
expRel_ :expRel_ expRelAux
         | lpar expRel_ rpar
         | expComp
         | expArt_;
index_arr: (lbra (exp (comma exp)*)? rbra)*;
lpar: '(';
rpar: ')';
lbra: '[';
rbra: ']';
expRelAux : LOGOP expRel_;
expComp:expArt_ expComp_;
expComp_: RELOP expArt_;
comma: ',';
val:  (ID | REAL | INT | CHR | STR);




COMMA: ',';
COMMENT : '/*' .*? '*/' -> skip ;
LINE_COMMENT: '//' ~[\r\n]* -> skip ;
ARREGLO: [aA][rR][rR][eE][gG][lL][oO];
DE:     [dD][eE];
PROC: [pP][rR][oO][cC][eE][dD][iI][mM][iI][eE][nN][tT][oO];
VAR: [vV][aA][rR];
TYPE: ([eE][nN][tT][eE][rR][oO]|
       [rR][eE][aA][lL]|
       [bB][oO][oO][lL][eE][aA][nN][oO]|
       [cC][aA][rR][aA][cC][tT][eE][rR]|
       [cC][aA][dD][eE][nN][aA]);
IF: [sS][iI];
WHILE: [mM][iI][eE][nN][tT][rR][aA][sS];
REPEAT: [rR][eE][pP][iI][tT][aA];
FOR: [pP][aA][rR][aA];
FUNCTION: [fF][uU][nN][cC][iI][oO][nN];
RETURN: [rR][eE][tT][oO][rR][nN][eE];
CASE: [cC][aA][sS][oO];
INICIO: [iI][nN][iI][cC][iI][oO];
FIN: [fF][iI][nN];
REGISTRO: [rR][eE][gG][iI][sS][tT][rR][oO];
ENTONCES: [eE][nN][tT][oO][nN][cC][eE][sS];
SINO: [sS][iI][nN][oO];
HAGA: [hH][aA][gG][aA];
ESCRIBA: [eE][sS][cC][rR][iI][bB][aA];
HASTA: [hH][aA][sS][tT][aA];
PARA: [pP][aA][rR][aA];
LEA: [lL][eE][aA];
LLAMAR: [lL][lL][aA][mM][aA][rR];
NUEVA_LINEA: [nN][uU][eE][vV][aA][_][lL][iI][nN][eE][aA];
ASSGN: '<-';
REAL: '-'?[0-9]+'.'[0-9]+;
INT: '-'?[0-9]+;
ARTOP:  '^' | '+' | '-' | '*' | '/' | [dD][iI][vV] | [mM][oO][dD] ;
LOGOP:  [yY] | [oO] ;
RELOP:  '=' | '<' | '>' | '<=' | '>=' | '<>' ;
STR: '"' ('\\' ["\\] | ~["\\\r\n])* '"' ;
CHR: '\'' (~[']) '\'' ;
ID: [a-zA-Z_][a-zA-Z0-9_]*;
ESP : [ \t\r\n]+ -> skip ;


