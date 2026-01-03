package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
import com.demo.service.ProjectService;
import com.demo.service.ProjectServiceImpl;

public class TestCRUD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProjectService pservice=new ProjectServiceImpl();
		EmployeeService eservice=new EmployeeServiceImpl();
		
		int choice=0;
		do {
			System.out.println("1. Add Project");
			System.out.println("2. Add Employees");
			System.out.println("3. Show All Employees");
			System.out.println("4. Delete Employee");
			System.out.println("5. Update Employees Salary");
			System.out.println("6. Add employee in existing project");
			System.out.println("7. display employee in sorted order");
			System.out.println("8. Exit\nchoice: ");
			
			choice=sc.nextInt();
			switch(choice) {
			case 1->{
				pservice.addNewProject();
			}
			case 2->{
				boolean status=eservice.addNewEmployee();
				if(status) {
					System.out.println("Employee Added Successfully");
				}else {
					System.out.println("Not Added");
				}
			}
			case 3->{
				List<Employee> elist=eservice.findAllEmployee();
				elist.stream().forEach(System.out::println);
			}
			
			case 4->{
				System.out.println("enter employee id to delete");
				int empid=sc.nextInt();
				boolean status=eservice.deleteById(empid);
				if(status) {
					System.out.println("employee deleted successfully");
				}else {
					System.out.println("not deleted");
				}
			}
			case 5->{
				System.out.println("enter employee id to update");
				int empid=sc.nextInt();
				System.out.println("enter new salary");
				double sal=sc.nextDouble();
				System.out.println("enter new name");
				String name=sc.next();
		    	boolean status=eservice.updateEmployeeById(empid,name,sal);
		    	if(status) {
		    		System.out.println("employee updated successfully");
		    	}else {
		    		System.out.println("Not updated");
		    	}
			
			}
			case 6->{
				System.out.println("enter employeeid for adding project");
				int eid=sc.nextInt();
				System.out.println("Enter project id to add");
				int pid=sc.nextInt();
				boolean status=eservice.addProjectToEmployee(eid,pid);
				if(status) {
					System.out.println("employee updated successfully with project addition");
				}else {
					System.out.println("not updated");
				}
			}
			case 7->{
				List<Employee> elist=eservice.SortEmployeeBySalary();
				elist.stream().forEach(System.out::println);
			}
			
			}
		}while(choice!=6);

	}

}
