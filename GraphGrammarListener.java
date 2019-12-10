// Generated from GraphGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GraphGrammarParser}.
 */
public interface GraphGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GraphGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GraphGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GraphGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphGrammarParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraph(GraphGrammarParser.GraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphGrammarParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraph(GraphGrammarParser.GraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphGrammarParser#graph_name}.
	 * @param ctx the parse tree
	 */
	void enterGraph_name(GraphGrammarParser.Graph_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphGrammarParser#graph_name}.
	 * @param ctx the parse tree
	 */
	void exitGraph_name(GraphGrammarParser.Graph_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphGrammarParser#config}.
	 * @param ctx the parse tree
	 */
	void enterConfig(GraphGrammarParser.ConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphGrammarParser#config}.
	 * @param ctx the parse tree
	 */
	void exitConfig(GraphGrammarParser.ConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphGrammarParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(GraphGrammarParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphGrammarParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(GraphGrammarParser.PathContext ctx);
}