package com.demo.linkedlists;

import com.demo.linkedlists.SinglyLinkedList.Node;

public class DoublyCircularLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
	    Node prev;
		public Node(int data) {
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	public DoublyCircularLinkedList() {
		head=null;
	}
	
	public void addNode(int val){
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
			head.prev=head;
			head.next=head;
		}else {
			//place temp at the last node
			Node temp=head.prev;
			newNode.next=head;
			//newNode.next=temp.next;
			newNode.prev=temp;
			temp.next=newNode;
			head.prev=newNode;
			
		}
		
	}
	//add by position
	public void addByPosition(int pos,int val) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node newNode = new Node(val);
				if(pos==1) {
					Node temp=head.prev;
					temp.next=newNode;
					newNode.next=newNode;
					newNode.prev=newNode;
					head.prev=newNode;
					head=newNode;
					
				}else {
					Node temp=head;
					int i=0;
					for(;temp.next!=head && i<pos-2;i++) {
						temp=temp.next;
					}
					if(i==pos-2) {
						newNode.prev=temp;
						newNode.next=temp.next;
						temp.next=newNode;
						newNode.next.prev=newNode;
					}else {
						System.out.println(pos+"is beyond the limit ");
					}
				}
	}
	}
	
	public void deleteByPosition(int pos) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node tail=head.prev;
			if(pos==1) {
				if(head==tail) {
					head=null;
				}else {
					head.next.prev=tail;
					tail.next=head.next;
					Node temp=head;
					head=head.next;
					temp.next=null;
				}
			} else {
				Node temp=head;
				int i=0;
				for(; temp.next!=head && i<pos-1;i++) {
					temp=temp.next;
				}
				if(i==pos-1) {
					temp.prev.next=temp.next;
					temp.next.prev=temp.prev;
					temp.prev=null;
					temp.next=null;
				}else {
					System.out.println(pos+"is beyond the limit ");
				}
			}
		}
		
	}
	
	public void delteByValue(int value) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node tail=head.prev;
			if(head.data==value) {
				if(head==tail) {
					head=null;
				}else {
					head.next=head.next;
					tail.next=head.next;
					Node temp=head;
					head=head.next;
					temp.next=null;
				}
			
			}else {
				Node temp=head;
				while(temp.next!=head && temp.data!=value) {
					temp=temp.next;
				}
				if(temp.data==value) {
					temp.prev.next=temp.next;
					temp.next.prev=temp.prev;
					temp.prev=null;
					temp.next=null;
				}else {
					System.out.println(value+"not found");
				}
			}
			}
	}
	
	public void displayData() {
		Node temp=head;
		do {
			System.out.print(temp.data+"--->");
			temp=temp.next;
		}while(temp!=head);
		System.out.println();
	}
	
	public void displayDataReverse() {
		Node temp=head.prev;
		do {
			System.out.print(temp.data+"----->");
			temp=temp.prev;
		}while(temp!=head.prev);
		System.out.println();
	}
		
	}



	

