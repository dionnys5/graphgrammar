grammar GraphGrammar;

prog: graph* EOF;
graph: VERTICE ARESTA VERTICE;

ARESTA: '->';
VERTICE: [a-zA-Z]+;
WS : [ \t\r\n]+ -> skip;