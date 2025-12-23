package com.demo.test;

import com.demo.queue.QueueList;

public class TestQueueList {

	public static void main(String[] args) {
		QueueList ob1=new QueueList();
		ob1.enQueue(55);
		ob1.enQueue(4);
		ob1.enQueue(6);
		ob1.deQueue();
		ob1.deQueue();
		ob1.deQueue();
		ob1.deQueue(); //queue is empty

	}

}
