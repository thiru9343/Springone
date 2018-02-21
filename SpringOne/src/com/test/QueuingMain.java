package com.test;

public class QueuingMain {
	public static void main(String[] args) {
		Queue queue = new Queue();
		Publisher p1 = new Publisher(0, 9999, queue);
		Publisher p2 = new Publisher(10000, 19999, queue);
		Publisher p3 = new Publisher(20000, 29999, queue);
		Subscriber s1 = new Subscriber(queue);
		Subscriber s2 = new Subscriber(queue);
		Subscriber s3 = new Subscriber(queue);
		p1.start();
		p2.start();
		p3.start();
		s1.start();
		s2.start();
		s3.start();
	}
}
