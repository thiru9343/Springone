package com.test;

public class Publisher extends Thread {
	private int start;
	private int end;
	private Queue queue;

	public Publisher(int start, int end, Queue queue) {
		this.start = start;
		this.end = end;
		this.queue = queue;
	}

	public void run() {
		for (int i = start; i <= end; i++) {
			queue.push(i);
		}
	}
}
