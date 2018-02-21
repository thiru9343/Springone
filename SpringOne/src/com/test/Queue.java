package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Queue {
	private List<Integer> elements;

	public Queue() {
		elements = new ArrayList<Integer>();
	}

	public void push(Integer no) {
		synchronized (elements) {
			elements.add(no);
		}
	}

	public Integer pop() {
		synchronized (elements) {
			if (elements.isEmpty()) {
				return -1;
			}
			return elements.remove(elements.size() - 1);
		}
	}
}
