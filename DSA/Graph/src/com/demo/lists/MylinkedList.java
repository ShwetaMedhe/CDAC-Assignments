package com.demo.lists;

public class MylinkedList {
	Node head;
	class Node{
		int data;
		//int weight;
		Node next;
		public Node(int data) {//,int weight) {
			super();
			this.data=data;
			this.next=null;
		}
	}
	public MylinkedList() {
		head=null;
	}
	
	public void addNode(int num) { //,int wt) {
		Node newNode=new Node(num);
		if(head!=null) {
			newNode.next=head;
		}
		head=newNode;
	}
	
	public boolean search(int val) {
		if(head==null) {
			return false;
		}else {
			Node temp=head;
			while(temp!=null && temp.data!=val) {
				temp=temp.next;
			}
			if(temp.data==val) {
				return true;
			}
			return false;
		}
	}
	
	public int[] getAdjacentNodes(int[] arr) {
		Node temp=head;
		for(int i=0;temp!=null && i<arr.length;i++) {
			arr[i]=temp.data;
			temp=temp.next;
		}
		return arr;
	}
	
	public void displayList() {
		if(head==null) {
			System.out.println("empty");
		}else {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data+"----->");
				temp=temp.next;
			}
			System.out.println("null");
			System.out.println();
		}
	}
	
}
