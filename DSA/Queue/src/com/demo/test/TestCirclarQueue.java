package com.demo.test;

import com.demo.queue.CircularQueue;

public class TestCirclarQueue {

	public static void main(String[] args) {
		CircularQueue cq=new CircularQueue();
		cq.enQueue(12);
		cq.enQueue(14);
		cq.enQueue(16);
		cq.deQueue();
		cq.deQueue();
		cq.deQueue();
		cq.deQueue();
	}

}
