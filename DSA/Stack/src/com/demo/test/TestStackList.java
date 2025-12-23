package com.demo.test;

import com.demo.stacks.StackList;

public class TestStackList {

	public static void main(String[] args) {
		StackList ob1=new StackList();
		ob1.push(3);
		ob1.push(4);
		ob1.push(5);
		ob1.pop();
		ob1.pop();
		ob1.pop();
		ob1.pop(); //stack is empty
	}

}
