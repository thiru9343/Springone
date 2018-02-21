package com.spring.first;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class MessageTO //implements InitializingBean, DisposableBean 
{
	private String msg;

	public void start() {
		msg="default value";
	}

	public void end() {
		msg=null;
	}

	public String getMessage() {
		return msg;
	}

	public void setMessage(String message) {
		this.msg = message;
	}

	/*@Override
	public void destroy() throws Exception {
		System.out.println("Destroying");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing");
	}*/
	
	public void init(){
		System.out.println("in init");
	}
	
	public void delete(){
		System.out.println("in delete");
	}

}
