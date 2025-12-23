package com.demo.linkedlist;

public class LinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next=null;
		}
		
	}
	public LinkedList() {
		head=null;
	}
	
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
	
	public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
	
	public boolean isPrime(int n) {
		if(n<=1)
			return false;
		for(int i=2;i*i<=n;i++) {
			if(n%2==0){
				return false;
			}
		}
		return true;
	}
	
	public void deletePrime() {
		
		while(head!=null && isPrime(head.data)) {
			head=head.next;
		}
		Node temp=head;
		Node prev=null;
		while(temp!=null) {
			if(isPrime(temp.data)) {
				prev.next=temp.next;
				temp=temp.next;
			}else {
				prev=temp;
				temp=temp.next;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		LinkedList lst=new LinkedList();
		lst.addNode(2);
		lst.addNode(3);
		lst.addNode(4);
		lst.addNode(5);
		System.out.println("Original list");
		lst.display();
		lst.deletePrime();
		System.out.println("After deleting");
		
		lst.display();
	}
	
	
}
