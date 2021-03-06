/*
 * generated by Xtext 2.25.0.M1
 */
package n7.intern.v2.xtext.parser.antlr;

import com.google.inject.Inject;
import n7.intern.v2.xtext.parser.antlr.internal.InternalIDSLParser;
import n7.intern.v2.xtext.services.IDSLGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class IDSLParser extends AbstractAntlrParser {

	@Inject
	private IDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalIDSLParser createParser(XtextTokenStream stream) {
		return new InternalIDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "IoTFramework";
	}

	public IDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(IDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
