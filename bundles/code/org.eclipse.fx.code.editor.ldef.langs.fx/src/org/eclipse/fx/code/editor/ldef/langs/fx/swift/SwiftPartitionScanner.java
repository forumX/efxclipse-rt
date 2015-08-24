package org.eclipse.fx.code.editor.ldef.langs.fx.swift;

public class SwiftPartitionScanner extends org.eclipse.jface.text.rules.RuleBasedPartitionScanner {
	public SwiftPartitionScanner() {
		org.eclipse.jface.text.rules.IPredicateRule[] pr = new org.eclipse.jface.text.rules.IPredicateRule[3];
		pr[0] = new org.eclipse.jface.text.rules.SingleLineRule(
			  "//"
			, ""
			, new org.eclipse.jface.text.rules.Token("__swift_single_line_comment")
			);
		pr[1] = new org.eclipse.jface.text.rules.MultiLineRule(
			  "/*"
			, "*/"
			, new org.eclipse.jface.text.rules.Token("__swift_multi_line_comment")
			);
		pr[2] = new org.eclipse.jface.text.rules.SingleLineRule(
			  "\""
			, "\""
			, new org.eclipse.jface.text.rules.Token("__swift_string")
			);
		setPredicateRules(pr);
	}
}