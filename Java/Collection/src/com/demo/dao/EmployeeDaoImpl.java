package com.demo.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	static List<Employee> elist;
	static {
		elist=new ArrayList<>();
		elist.add(new Employee(100, "Mayur", 45627, LocalDate.of(2024, 05, 13)));
		elist.add(new Employee(101, "Ram", 75340, LocalDate.of(2025, 11, 21)));
		elist.add(new Employee(102, "Shreya", 67890, LocalDate.of(2021, 03, 25)));
				}

	@Override
	public boolean save(Employee e) {
		elist.add(e);
		return true;
	}

	@Override
	public List<Employee> findAll() {	
		return elist;
	}

	@Override
	public Employee findById(int eid) {
		int pos=elist.indexOf(new Employee(eid));
		if(pos!=-1) {
			return elist.get(pos);
		}
	
		return null;
	}

	@Override
	public boolean removeById(int eid) {	  
		return elist.remove(new Employee(eid));
	}

	@Override
	public List<Employee> findByName(String nm) {
		
		List<Employee> temp= elist.stream()
                .filter(emp->emp.getEname().equals(nm))
                .collect(Collectors.toList());

if(temp.size()>0) {
	return temp;
}
		return null;
}

	@Override
	public boolean modifyById(int eid,double sal) {
		int pos=elist.indexOf(new Employee(eid));
		if(pos!=-1) {
			Employee e = elist.get(pos);
			e.setSal(sal);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean removeBySal(double sal) {
		return elist.removeIf(emp->emp.getSal()>sal);
		
	}

	@Override
	public List<Employee> findBySal(double sal) {
		List<Employee> lst=elist.stream()
				.filter(emp->emp.getSal()==sal)
				.collect(Collectors.toList());
		if(lst.size()>0) {
			return lst;
		}		
		return null;
	}

	@Override
	public List<Employee> sortBySal() {
		List<Employee> lst=new ArrayList<>();
		for(Employee e:elist) {
			lst.add(e);
		}
		lst.sort(null);
		return lst;
	}

	@Override
	public List<Employee> sortByName() {
		List<Employee> lst=new ArrayList<>();
		for(Employee e:elist) {
			lst.add(e);
		}
		Comparator<Employee> c=(o1,o2)->{
			System.out.println("in functional comparator");
			return o1.getEname().compareTo(o2.getEname());
		};
		lst.sort(c);
		return lst;
	}


}

	