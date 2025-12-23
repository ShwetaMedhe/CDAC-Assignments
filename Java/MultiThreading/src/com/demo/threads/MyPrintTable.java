package com.demo.threads;

import com.demo.beans.MyClass;

public class MyPrintTable extends Thread{
   private int n;
   private MyClass ob;
   
	
	public MyPrintTable(int n, MyClass ob) {
	super();
	this.n = n;
	this.ob = ob;
}


	public void run() {
		ob.printTable(n);
	}
}
