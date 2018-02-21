package com.spring.javaConfig;

public class TextEditor {
	private SpellChecker spellChecker;

	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker = spellChecker;
	}

	public TextEditor() {
		// TODO Auto-generated constructor stub
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

	public void setSpellChecker(SpellChecker spellChecker2) {
		this.spellChecker = spellChecker2;

	}
}