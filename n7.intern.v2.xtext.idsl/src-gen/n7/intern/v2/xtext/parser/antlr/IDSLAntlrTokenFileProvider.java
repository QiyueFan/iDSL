/*
 * generated by Xtext 2.25.0.M1
 */
package n7.intern.v2.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class IDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("n7/intern/v2/xtext/parser/antlr/internal/InternalIDSL.tokens");
	}
}
