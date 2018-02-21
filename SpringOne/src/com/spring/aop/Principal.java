package com.spring.aop;

public class Principal {
	private String name;
	private String email;

	public String getName() {
		System.out.println("Principal Name : " + name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		System.out.println("Email : " + email);
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
