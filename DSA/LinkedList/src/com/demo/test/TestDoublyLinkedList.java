package com.demo.test;

import com.demo.linkedlists.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList dlist=new DoublyLinkedList();
		dlist.addNode(12);
		dlist.addNode(15);
		dlist.addNode(20);
		dlist.addNode(16);
		dlist.addNode(30);
	//	dlist.displayData();
		//dlist.addByPosition(4,18);
		//dlist.displayData();
		
//		dlist.addByValue(25,16);
//		dlist.addByValue(90, 12);
//		dlist.addByValue(89, 20);
		//dlist.deleteByValue(25);
		//dlist.addByValue(89, 32);
		dlist.displayData();
		System.out.println("\n");
		dlist.deleteByPosition(3);
		dlist.displayData();

	}

}
