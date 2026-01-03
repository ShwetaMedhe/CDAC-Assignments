package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao edao;
	
	public EmployeeServiceImpl() {
		edao=new EmployeeDaoImpl();
	}

	@Override
	public boolean addNewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter eid");
		int eid=sc.nextInt();
		System.out.println("ENter ename");
		String ename=sc.next();
		System.out.println("Enter salary");
		double sal=sc.nextDouble();
		System.out.println("Enter joining date(dd/MM/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e=new Employee(eid,ename,sal,ldt);
		return edao.save(e);
		
	}

	@Override
	public boolean deleteById(int id) {
		return edao.deleteById(id);
		
	}


	
}
