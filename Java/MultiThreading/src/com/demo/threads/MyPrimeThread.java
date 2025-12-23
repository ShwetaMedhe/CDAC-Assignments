package com.demo.threads;

import com.demo.beans.MyClass;

public class MyPrimeThread implements Runnable{
	private int n;
	private MyClass ob;
	
	public MyPrimeThread(MyClass ob, int n) {
		super();
		this.ob=ob;
		this.n=n;
	}

	@Override
	public void run() {
		boolean status=ob.checkPrime(n);
		if(status) {
			System.out.println("number is prime");
		}else {
			System.out.println("number is not prime");
		}
		
	}
	
}
