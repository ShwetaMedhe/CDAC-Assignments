package com.demo.dao;

import java.util.Map;

public interface CourseDao {

	boolean save(String cname, int capacity);

	Map<String, Integer> findAll();

	int findByName(String cname);

	boolean updateByName(String cname, int newcap);
	
	
}