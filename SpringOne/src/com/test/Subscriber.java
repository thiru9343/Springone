package com.test;

public class Subscriber extends Thread {
	private Queue queue;

	public Subscriber(Queue queue) {
		this.queue = queue;
	}

	public void run() {
		Integer no;
		while (true) {
			no = queue.pop();
			if (no == -1) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				no = queue.pop();
			}
			if (no != -1) {
				System.out.println(no);
			} else {
				break;
			}
		}
	}
}
