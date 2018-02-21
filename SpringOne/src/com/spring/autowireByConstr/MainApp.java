package com.spring.autowireByConstr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"autowireByConstr.xml");

		TextEditor te = (TextEditor) context.getBean("textEditor");

		te.spellCheck();
	}
}
