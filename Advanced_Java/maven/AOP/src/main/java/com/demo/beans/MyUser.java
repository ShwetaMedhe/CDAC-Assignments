package com.demo.beans;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
public class MyUser {
	private String name;

	public MyUser() {
		super();
	}

	public MyUser(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void m1() {
		System.out.println("in m1 method");
	}
	
	public int m2(int x) {
		System.out.println("in m2 method");
		return x+10;
	}

	@Override
	public String toString() {
		System.out.println("tostring method called");
		return "MyUser [name=" + name + "]";
	}
   
	
}
