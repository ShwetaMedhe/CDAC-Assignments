package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> findAllEmployee();

	boolean removeById(int empid);

	boolean modifyEmploeeById(int empid, String name, double sal);

	Employee findById(int eid);

	boolean addextraProjectToEmployee(Employee e, Project p);

	List<Employee> sortBySalary();

}
