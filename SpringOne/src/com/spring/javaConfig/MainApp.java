package com.spring.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				HelloWorldConfig.class);

		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();

		//dependency injection
		ApplicationContext ctx1 = new AnnotationConfigApplicationContext(
				TextEditorConfig.class);

		TextEditor te = ctx1.getBean(TextEditor.class);

		te.spellCheck();
	}
}
