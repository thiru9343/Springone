package com.spring.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}

	@Bean
	public SpellChecker spellChecker() {
		return new SpellChecker();
	}

	@Bean
	public TextEditor textEditor() {
		return new TextEditor(spellChecker());
	}
	// <bean id="helloWorld" class="com.spring.javaConfig.HelloWorld/>
}
