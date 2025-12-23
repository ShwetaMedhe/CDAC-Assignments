package com.demo.test;

import com.demo.linkedlists.DoublyCircularLinkedList;

public class TestDoublyCircularLinkedList {

	public static void main(String[] args) {
		DoublyCircularLinkedList clist = new DoublyCircularLinkedList();
		clist.addNode(20);
		clist.addNode(40);
		clist.addNode(67);
		clist.addNode(12);
		clist.displayData();
		
		clist.addByPosition(3, 50);
		clist.displayData();
		
		clist.displayDataReverse();
		
		clist.deleteByPosition(3);
		clist.displayData();
		
		clist.delteByValue(20);
		clist.displayData();
		
	}

}
