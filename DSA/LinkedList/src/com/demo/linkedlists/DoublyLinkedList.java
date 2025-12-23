package com.demo.linkedlists;

import com.demo.linkedlists.SinglyLinkedList.Node;

public class DoublyLinkedList {
	Node head;
	class Node{
		int data;
		Node prev,next;
		public Node(int data) {
			
			this.data = data;
			prev=null;
			next=null;
			
		}
		
	}
	public DoublyLinkedList() {
		head=null;
	}
	
	//add by value
	public void addByValue(int val,int num) {
		Node newNode = new Node(val);
		Node temp=head;
		
		while(temp!=null && temp.data!=num) 
			temp=temp.next;
			
			if(temp!=null) {
				newNode.next=temp.next;
				newNode.prev=temp;
				temp.next=newNode;
				
				if(newNode!=null) {
					newNode.next.prev=newNode;
				}
			}else {
				System.out.println(num+"not found");
			}
	}
	
	//add node at the end
	public void addNode(int val) {
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
				
			}
			newNode.prev=temp;
			temp.next=newNode;
		}
		
	}
	
	//add by position
	public void addByPosition(int pos,int val) {
		Node newNode=new Node(val);
		//at pos 1
		if(pos==1) {
			newNode.next=head;
			if(head!=null) 
				head.prev=newNode;
			head=newNode;
			}else {
				Node temp=head;
				for(int i=1;temp!=null && i<=pos-2;i++) {
					temp=temp.next;
				}
				if(temp!=null) {
					newNode.next=temp.next;
					newNode.prev=temp;
					temp.next=newNode;
					if(newNode.next!=null) {
						newNode.next.prev=newNode;
					}
				}else {
					System.out.println(pos+" is beyond limit"); 
				}
				
		}
		
	}
	
	public void deleteByValue(int val) {
		Node temp=head;
		if(head.data==val) {
			head.next.prev=null;
			head=temp.next;
			temp.next=null;
		}else {
			while(temp!=null && temp.data!=val) {
				temp=temp.next;
			}
			if(temp!=null) {
				temp.prev.next=temp.next;
				if(temp.next!=null) {
					temp.next.prev=temp.prev;
					temp.next=null;
				}
				temp.prev=null;
			}else {
				System.out.println(val+" not found");
			}
		}
		
	}
	
	
	public void deleteByPosition(int pos) {
		Node temp=head;
		 if(pos==1) {
			 head=temp.next;
			 head.prev=null;
			 
		 }else {
			 for(int i=0; temp!=null && i<pos-1;i++) {
				 temp=temp.next;
			 }
			 if(temp!=null) {
				 temp.prev.next=temp.next;
				 if(temp.next!=null) {
					 temp.next.prev=temp.prev;
					 temp.next=null;
				 }
				 temp.prev=null;
			 } else {
				 System.out.println(pos+"is beyond the limit");
			 }
		 }
	}
	
	
	//display
	public void displayData() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"---->");
			temp=temp.next;
		}
		System.out.print("null");
		
		
	}
	
}
