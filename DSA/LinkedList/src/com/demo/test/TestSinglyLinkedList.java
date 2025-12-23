package com.demo.test;

import com.demo.linkedlists.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList list1=new SinglyLinkedList();
		list1.addNode(12);
		list1.addNode(10);
		list1.addNode(30);
		list1.addNode(13);
		list1.addByNum(4, 12);
		list1.addByPosition(2, 8);
		list1.deleteByValue(30);
		list1.deleteByPosition(4);
		list1.displayData();
	}

}
