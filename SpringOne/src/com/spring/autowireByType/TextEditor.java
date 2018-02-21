package com.spring.autowireByType;

public class TextEditor {
	private SpellChecking spellChecker;
	private String name;

	public void setSpellChecker(SpellChecking spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	public void setSpellChecker(String spellChecker) {

	}

	public SpellChecking getSpellChecker() {
		return spellChecker;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}