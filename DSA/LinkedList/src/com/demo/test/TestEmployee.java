package com.demo.test;

import com.demo.beans.Employee;
import com.demo.linkedlists.SinglyLinkedListEmployee;


public class TestEmployee {

	public static void main(String[] args) {
		SinglyLinkedListEmployee elist=new SinglyLinkedListEmployee();
		elist.addNode(new Employee(12,"Shruti",98787));
		elist.addNode(new Employee(13,"Shreya",45345));
		elist.addNode(new Employee(14,"Shweta",45657));
		elist.addNode(new Employee(15,"Ashu",04747));
		elist.addNode(new Employee(16,"Sangeeta",12435));
		elist.displayData();
		System.out.println("----------------");
		
		elist.addByNum(new Employee(17,"Shubhangi",45678),14);
		elist.displayData();		
		System.out.println("----------------");
		
		elist.deleteByValue(13);
		elist.deleteByValue(15);
		elist.modifysalById(14, 76355);	
		elist.deleteByPosition(2);
		elist.displayData();
	}

}
