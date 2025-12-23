package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	static Set<Employee> eset;
	static {eset = new HashSet<>();
	eset.add(new Employee (101,"Rahul",56729, LocalDate.of(2023,03,27)));
	eset.add(new Employee(103,"Anushka",782000, LocalDate.of(2000, 06, 19)));
	eset.add(new Employee(104,"Shruti",65600, LocalDate.of(2001, 03, 23)));
	eset.add(new Employee(105,"Shweta",67500, LocalDate.of(2000, 06, 24)));
	eset.add(new Employee(106,"Harsh",80255, LocalDate.of(2002, 11, 20)));
	
	}
	@Override
	public boolean save(Employee e) {
		return eset.add(e);
	}
	@Override
	public Set<Employee> findAll() {
		
		return eset;
	}
	@Override
	public Employee findById(int id) {
		for(Employee e :eset) {
			if(e.getEmpid()==id) {
				return e;
			}
		}
		Optional<Employee> ob=eset.stream().filter(e->e.getEmpid()==id).findFirst();
		if(ob.isPresent()) {
			return ob.get();
		}
		return null;
	}
	@Override
	public Set<Employee> findByName(String nm) {

		Set <Employee>es=eset.stream().filter(e->e.getEname().equals(nm)).collect(Collectors.toSet());
		if(es.size()>0) {
			return es;
		}
		return null;
		
			
	}
	@Override
	public boolean updateBySalary(int id, double sal) {
		Employee e=findById(id);
		if(e!=null) {
			e.setSal(sal);
			return true;
		}
		return false;
	}
	@Override
	public boolean removeById(int id) {
		return eset.remove(new Employee(id));
	}
	@Override
	public boolean removeBySal(double sal) {
		return eset.removeIf(e->e.getSal()>sal);
	}
	@Override
	public Set<Employee> findBySal(double sal) {
	    return eset.stream()
	               .filter(e -> e.getSal() == sal)
	               .collect(Collectors.toSet());
	}
	@Override
	public Set<Employee> sortById() {
		Set<Employee> tset=new TreeSet<>();
		for(Employee e:eset) {
			tset.add(e);
		}
		return tset;
		
	}
	@Override
	public List<Employee> sortByName() {
		Comparator<Employee> c=(o1,o2)->{
			System.out.println("in name comparator "+o1.getEname()+"-----"+o2.getEname());
			return o1.getEname().compareTo(o2.getEname());
		};
		//duplicate names will not be considered
		//Set<Employee> tset=new TreeSet<>(c);
		List<Employee> elist=new ArrayList<>();
		for(Employee e:eset) {
			elist.add(e);
		}
		elist.sort(c);
		return elist;
	}
	@Override
	public List<Employee> sortBySal() {
		Comparator<Employee> csal=(o1,o2)->{
			System.out.println("in sal comparator "+o1.getSal()+"-----"+o2.getSal());
			return (int)(o1.getSal()-o2.getSal());
		};
		List<Employee> elist=new ArrayList<>();
		for(Employee e:eset) {
			elist.add(e);
		}
		elist.sort(csal);
		return elist;
		
	} 
    
     
    
    
	
	

}
