package com.test.virtual;

public class VirtualMain {
	public static void main(String[] args) {
		TestA a =new TestA();
		TestB b = new TestB();
	
		((TestA)b).print();
	}
}
