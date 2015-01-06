/*
* generated by Xtext
*/
package org.eclipse.xtext.parser.indentation.parser.antlr;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;
import org.eclipse.xtext.parser.indentation.parser.antlr.internal.InternalIndentationAwareTestLanguageParser;

public class IndentationAwareTestLanguageTokenSource extends AbstractIndentationTokenSource {
	
	public IndentationAwareTestLanguageTokenSource(TokenSource delegate) {
		super(delegate);
	}
	
	@Override
	protected boolean shouldSplitTokenImpl(Token token) {
		return token.getType() == InternalIndentationAwareTestLanguageParser.RULE_WS;
	}

	@Override
	protected int getBeginTokenType() {
		return InternalIndentationAwareTestLanguageParser.RULE_INDENT;
	}

	@Override
	protected int getEndTokenType() {
		return InternalIndentationAwareTestLanguageParser.RULE_DEDENT;
	}
	
}
