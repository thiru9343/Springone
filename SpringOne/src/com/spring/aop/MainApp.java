package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext(
					"aop-config.xml");
			Student student = (Student) context.getBean("student");
			student.getName();
			student.getAge();
			//student.printThrowException();
			Professor p = (Professor) context.getBean("professor");
			p.getId();
			p.setName("Joseph");
			Principal princi = (Principal) context.getBean("principal");
			princi.getEmail();
			princi.getName();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}