package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Stud")
public class Student {
	@Id
	private int sid;
	private String sname;
	private int marks;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinTable(name="cid")
	private Course course;
	public Student() {
		super();
	}
	public Student(int sid, String sname, int marks, Course course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
		this.course = course;
	}
	
	
	public Student(int sid, String sname, int marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + ", course=" + course + "]";
	}
	
	

}
