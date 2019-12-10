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
}