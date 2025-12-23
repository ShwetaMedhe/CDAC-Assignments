package com.demo.beans;

import java.util.*;

public class Person {
	static int scount,vcount,ccount;
	static {
		scount=0;
		vcount=0;
		ccount=0;
		
	}
	
	private String pid;
	private String pname;
	private Date bdate;
	
	
	public Person() {
		super();
		System.out.println("in default constructor is called");
		
		pid =generateId("s");
		pname =null;
		bdate=null;
	}
	
	

	public Person(String emptype, String pname, Date bdate) {
		super();
		System.out.println("in parameterized constructor");
		pid=generateId(emptype);
		this.pname = pname;
		this.bdate = bdate;
	}

	
	private String generateId(String emptype) {
		if(emptype.equals("s")) {
			scount++;
			return emptype+scount;
		} else if(emptype.equals("v")){
			vcount++;
			return emptype+vcount;
		} else if(emptype.equals("c")) {
			ccount++;
			return emptype+ccount;
		}
		return null;
		
	}



	public static void setScount(int scount) {
		Person.scount = scount;
	}



	public static void setVcount(int vcount) {
		Person.vcount = vcount;
	}



	public static void setCcount(int ccount) {
		Person.ccount = ccount;
	}



	public void setPid(String pid) {
		this.pid = pid;
	}



	public void setPname(String pname) {
		this.pname = pname;
	}



	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}



	public static int getScount() {
		return scount;
	}

	public static int getVcount() {
		return vcount;
	}

	public static int getCcount() {
		return ccount;
	}

	public String getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public Date getBdate() {
		return bdate;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", bdate=" + bdate + "]";
	}
	

}
