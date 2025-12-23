package com.demo.linkedlists;

public class SinglyLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
	public SinglyLinkedList() {
		head=null;
	}
	
	//add at end
		public void addNode(int value) {
			Node newNode=new Node(value);
			
			if(head==null) {
				head=newNode;
			}else {
				Node temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newNode;
			}
		}
		
		
		//add by position
		public void addByPosition(int pos,int value) {
			Node newNode=new Node(value);
			if(pos==1) {
				newNode.next=head;
				head=newNode;
			}else {
				Node temp=head;
				for(int i=1;temp!=null&&i<=pos-2;i++){
					temp=temp.next;
				}
				if(temp!=null) {
					
					newNode.next=temp.next;
					temp.next=newNode;
				}else {
					System.out.println("Given position "+pos+"is beyond the length of list");
				}
						
			}
		}
		
		
	//add value after num
	public void addByNum(int value,int num) {
		Node newNode=new Node(value);
		Node temp=head;
		while(temp!=null && temp.data!=num) {
			temp=temp.next;
			
		}
		//num found
		if(temp!=null) {
			newNode.next=temp.next;
			temp.next=newNode;
		}else {
			System.out.println(num+"Not found");
		}
	}
	
	
	
	
	
	//display data
	public void displayData() {
		if(head==null) {
			System.out.println("List is empty");
		}else {
			for(Node temp=head;temp!=null;temp=temp.next) {
				System.out.println(temp.data+"--->");
			}
			System.out.println("null");
		}
	}
	
	//delete by value
	public void deleteByValue(int val) {
		Node temp=head;
		if(head.data==val) {
			head=temp.next;
			temp.next=null;
		}else {
			Node prev=null;
			while(temp!=null &&temp.data!=val) {
				prev=temp;
				temp=temp.next;
			}
			//value found
			if(temp!=null) {
				prev.next=temp.next;
				temp.next=null;
				
			}else {
				System.out.println(val+" not foumd");
			}
		}
	}
	
	//delete by position
	public void deleteByPosition(int pos) {
		Node temp=head;
		if(pos==1) {
			head=temp.next;
			temp.next= null;
		}else {
			Node prev=null;
			for(int i=0;temp!=null && i<pos-1;i++) {
				prev=temp;
				temp=temp.next;
			}
			if( temp!=null) {
				prev.next=temp.next;
				temp.next=null;
				
			}else {
				System.out.println(pos+" is beyond the limit");
			}
		}
	}
	
	
}
