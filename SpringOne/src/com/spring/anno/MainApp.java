package com.spring.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"injAnnotations.xml");

		Student student = (Student) context.getBean("student1");

		System.out.println("Name : " + student.getName());
		System.out.println("Age : " + student.getAge());

		Profile profile = (Profile) context.getBean("profile");

		profile.printAge();
		profile.printName();
	}
}
