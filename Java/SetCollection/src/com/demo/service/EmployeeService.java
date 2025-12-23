package com.demo.service;

import java.util.Set;
import java.util.List;

//import com.demo.test.Set;

import com.demo.beans.Employee;
//import com.demo.test.List;

public interface EmployeeService {

	boolean addNewEmployee();

	Set<Employee> displayAll();

	Employee displayById(int id);

	Set<Employee> displayByName(String nm);

	boolean updateBySalary(int id, double sal);

	boolean deleteById(int id);

	boolean deleteBySal(double sal);

	Set<Employee> displayBySal(double sal);

	List<Employee> sortBySal();

	Set<Employee> sortById();

	List<Employee> sortByName();

}
