import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
private void printhello(String HelloSentence) {
	    // Get our lexer
	    HelloLexer lexer = new HelloLexer(new ANTLRInputStream(HelloSentence));
	 
	    // Get a list of matched tokens
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	 
	    // Pass the tokens to the parser
	    HelloParser parser = new DrinkParser(tokens);
	 
	    // Specify our entry point
	    HelloSentenceContext drinkSentenceContext = parser.HelloSentence();
	 
	    // Walk it and attach our listener
	    ParseTreeWalker walker = new ParseTreeWalker();
	    AntlrHelloListener listener = new AntlrHelloListener();
	    walker.walk(listener, drinkSentenceContext);
	}