package com.spring.aop;

public class Professor {
	private String id;
	private String name;
	private String subject;

	public String getId() {
		System.out.println("ID : " + id);
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
