package com.demo.service;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.demo.dao.CourseDao;
import com.demo.dao.CourseDaoImpl;
import java.util.Scanner;

public class CourseServiceImpl implements CourseService{
	private CourseDao cdao;
	
	public CourseServiceImpl() {
		super();
		this.cdao=new CourseDaoImpl();
	}

	@Override
	public boolean addNewCourse() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter course name");
		String cname=sc.next();
		System.out.println("enter capacity");
		int capacity=sc.nextInt();
		return cdao.save(cname,capacity);
		
	}

	@Override
	public Map<String, Integer> displayAll() {
		return cdao.findAll();
	}

	@Override
	public int searchByName(String cname) {
		return cdao.findByName(cname);
	}

	@Override
	public boolean modifyByName(String cname, int newcap) {
		return cdao.updateByName(cname,newcap);
	}

	@Override
	public Set<String> displayByCapacity(int capacity) {
		return cdao.findByCapacity(capacity);
	}

	@Override
	public boolean modifyCourseName(String oname, String nname) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<String, Integer> sortByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Entry<String, Integer>> sortByCapacity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteByName(String cname) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByCapacity(int capacity) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
