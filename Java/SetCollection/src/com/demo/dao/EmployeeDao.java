package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	Set<Employee> findAll();

	Employee findById(int id);

	Set<Employee> findByName(String nm);

	boolean updateBySalary(int id, double sal);

	boolean removeById(int id);

	boolean removeBySal(double sal);

	Set<Employee> findBySal(double sal);

	List<Employee> sortBySal();

	Set<Employee> sortById();

	List<Employee> sortByName();




}
