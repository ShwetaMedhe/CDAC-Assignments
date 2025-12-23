package com.demo.dao;

import java.util.Map;
import java.util.HashMap;
public class CourseDaoImpl implements CourseDao{
	static Map<String,Integer> hm;
	static {
		hm=new HashMap<>();
		hm.put("DAC", 240);
		hm.put("DBDA", 65);
		hm.put("DTISS", null);
	}
	@Override
	public boolean save(String cname, int capacity) {
		if(hm.containsKey(cname))
		return false;
		hm.put(cname, capacity);
		return true;
	}
	@Override
	public Map<String, Integer> findAll() {
		return hm;
	}
	@Override
	public int findByName(String cname) {
		if(hm.containsKey(cname)) {
			hm.put(cname, newcap);
			return true;
		}
		return false;
			
	}
	@Override
	public boolean updateByName(String cname, int newcap) {
		if(hm.containsKey(cname)) {
			hm.put(cname, newcap);
			return true;
		}
		return false;
	}
	
	
}
