package com.demo.linkedlists;

import com.demo.beans.Employee;
import com.demo.linkedlists.SinglyLinkedList.Node;

public class SinglyLinkedListEmployee {
	Node head;
	class Node{
		Employee data;
		Node next;
		public Node(Employee data) {
			this.data=data;
			this.next=null;
		}
	}
	public SinglyLinkedListEmployee() {
		this.head=null;
	}
	
	//add value after num
	public void addByNum(Employee ob,int empnum) {
		Node newNode=new Node(ob);
		Node temp=head;
		while(temp!=null && temp.data.getEmpno()!=empnum) {
			temp=temp.next;
			
		}
		//num found
		if(temp!=null) {
			newNode.next=temp.next;
			temp.next=newNode;
		}else {
			System.out.println(empnum+"Not found");
		}
	}
	
	//add by position
	public void addByPosition(int pos,Employee ob) {
		Node newNode=new Node(ob);
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
	
	
	//add at end
	public void addNode(Employee ob) {
		Node newNode=new Node(ob);
		
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
	public void deleteByValue(int empno) {
		Node temp=head;
		if(head.data.getEmpno()==empno) {
			head=temp.next;
			temp.next=null;
		}else {
			Node prev=null;
			while(temp!=null &&temp.data.getEmpno()!=empno) {
				prev=temp;
				temp=temp.next;
			}
			//value found
			if(temp!=null) {
				prev.next=temp.next;
				temp.next=null;
				
			}else {
				System.out.println(empno+" not found");
			}
		}
	}
	
	public void modifysalById(int empno,double newsal) {
		Node temp=head;
		while(temp!=null && temp.data.getEmpno()!=empno) {
			temp=temp.next;
		}
		if(temp!=null) {
			temp.data.setSal(newsal);
			System.out.println("salary updated");
		}else{
			System.out.println(empno + " not found");
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
