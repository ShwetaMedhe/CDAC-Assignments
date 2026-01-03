package com.demo.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course {
	@Id
	private int cid;
	private String cname;
	@OneToMany(mappedBy="course")
	Set<Student> stset;
	public Course() {
		super();
	}
	public Course(int cid, String cname, Set<Student> stset) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.stset = stset;
	}
	public Course(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Set<Student> getStset() {
		return stset;
	}
	public void setStset(Set<Student> stset) {
		this.stset = stset;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", stset=" + stset + "]";
	}
	
	
	
	
}
