package com.spring.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"first.xml");

		System.out.println("Context Created");
		MessageTO obj1 = (MessageTO) context.getBean("messageTO");
		NewMessageTO obj3 = (NewMessageTO)context.getBean("newMessageTO");
		//MessageTO obj2 = (MessageTO) context.getBean("messageTO");

		System.out.println("MESSAGE: " + obj1.getMessage());
		
		System.out.println("NEW MESSAGE: " + obj3.getNewMessage());
		
		obj3.setNewMessage("This is a new message");
		
		NewMessageTO obj4 = (NewMessageTO)context.getBean("newMessageTO");
		
		System.out.println(obj4.getNewMessage());

		/*
		 * obj1.setMessage("New Spring Project");
		 * 
		 * obj1.setMessage("Welcome to Spring");
		 * 
		 * MessageTO obj2 = (MessageTO) context.getBean("messageTO");
		 * 
		 * System.out.println("MESSAGE: " + obj2.getMessage());
		 * 
		 * obj2.setMessage("Saroj's message");
		 * 
		 * System.out.println(obj1.getMessage());
		 * 
		 * MessageTO obj3 = (MessageTO) context.getBean("newMessageTO");
		 * 
		 * System.out.println(obj3.getMessage());
		 * 
		 * NewMessageTO obj = (NewMessageTO) context.getBean("newMessageTO");
		 * 
		 * //MessageTO obj1 = (MessageTO) context.getBean("messageTO");
		 * 
		 * System.out.println(obj.getNewMessage());
		 */

		((AbstractApplicationContext) context).close();
	}
}
