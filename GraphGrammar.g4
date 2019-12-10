grammar GraphGrammar;

prog: graph* EOF;
graph: graph_name (config)* path+;
graph_name: 'grafo ' NOME+ ':';
config: ('tamanho=' NUMBER+ | 'forma=' CORES) ';';
path: LETRA+ ('<')? '-' (NUMBER)? '-' ('>')? LETRA+;

CORES: 'quadrado'|'circulo'|'diamante';
LETRA: [a-zA-Z];
NUMBER: [0-9];
NOME: [a-zA-Z0-9]+;
WS: [ \t\r\n]+ -> skip;