package com.demo.test;

import com.demo.stacks.MyStackArray;

public class TestMyStackArray {

	public static void main(String[] args) {
		MyStackArray ob=new MyStackArray(5);
		ob.push(4);
		ob.push(12);
		ob.push(5);
		ob.push(8);
		System.out.println("-------------");
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop()); //stack is empty
	}

}
