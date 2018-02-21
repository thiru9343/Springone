package com.spring.advice;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Date;

public class Logging {

	/**
	 * This is the method which I would like to execute before a selected method
	 * execution.
	 */
	public void startLog() {
		System.out.println("Start of Method");
	}

	/**
	 * This is the method which I would like to execute after a selected method
	 * execution.
	 */
	public void endLog() {
		System.out.println("End of Method");
	}

	public void timeLog() {
		System.out.println(new Date());
	}

	/**
	 * This is the method which I would like to execute when any method returns.
	 */
	public void returnValue(Object retVal) {
		System.out.println("Returning:" + retVal);
	}

	/**
	 * This is the method which I would like to execute if there is an exception
	 * raised.
	 */
	public void handleException(Exception ex) {
		System.out.println("Some problem in the application");
	}

}