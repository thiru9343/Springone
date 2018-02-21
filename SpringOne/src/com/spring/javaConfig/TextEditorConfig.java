package com.spring.javaConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(HelloWorldConfig.class)
public class TextEditorConfig {

   
   @Bean(initMethod = "Start", destroyMethod = "end")
   @Scope("prototype")
   public TextEditor textEditor(){
      //return (new TextEditor()).setSpellChecker(spellChecker());
	   return new TextEditor( spellChecker() );
      
   }

   @Bean 
   public SpellChecker spellChecker(){
      return new SpellChecker( );
   }
}