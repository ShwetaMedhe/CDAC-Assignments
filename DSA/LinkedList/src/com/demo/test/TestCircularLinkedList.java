package com.demo.test;

import com.demo.linkedlists.CircularLinkedList;

public class TestCircularLinkedList {

	public static void main(String[] args) {
		CircularLinkedList clist=new CircularLinkedList();
		clist.addNode(5);
		clist.addNode(10);
		clist.addNode(15);
		clist.addNode(20);
		clist.displaData();
		
		clist.addByPoisition(3, 32);
		clist.deleteByValue(15);
		clist.deleteByValue(3);
		clist.addByValue(3, 15);
		clist.displaData();

	}

}
