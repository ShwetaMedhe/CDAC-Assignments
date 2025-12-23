package com.demo.test;

import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;

import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
import com.demo.beans.Employee;

public class TestEmployeeSetDetails {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		int choice=0;
		
		do {
			System.out.println("1. add new employee\n 2. display all\n3. search by id");
			System.out.println("4. Search by name\n 5. update sal\n6. delete by id\n7. delete by salary\n");
			System.out.println("8. search by salary \n 9. sort by salary\n10. Sort By name\n 11. Sort By id\n12. exit\n choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1->{
				boolean status=eservice.addNewEmployee();
				if(status) {
					System.out.println("Added successfully");
				}
				else {
					System.out.println("id not found");
				}
				
			}
			case 2->{
				Set<Employee> eset=eservice.displayAll();
				eset.forEach(System.out::println);
						
			}
			case 3->{
				System.out.println("Enter Id");
				int id=sc.nextInt();
				Employee e=eservice.displayById(id);
				if(e!=null) {
					System.out.println(e);
				}else {
					System.out.println("not found");
				}
			}
			case 4->{
				System.out.println("enter name");
				String nm=sc.next();
				Set<Employee> eset=eservice.displayByName(nm);
				if(eset!=null) {
					eset.forEach(System.out::println);
				}else {
					System.out.println("not found");
				}
			}
			case 5->{
				System.out.println("Enter id");
				int id=sc.nextInt();
				System.out.println("Ente salary");
				double sal=sc.nextDouble();
				boolean status=eservice.updateBySalary(id,sal);
				if(status) {
					System.out.println("updated successfully");
					
				}
				else {
					System.out.println("Not found");
				}
			}
			case 6->{
				System.out.println("Enter id to delete ");
				int id=sc.nextInt();
				boolean status=eservice.deleteById(id);
				if(status) {
					System.out.println("deleted successfully");
					
				}
				else {
					System.out.println("Not found");
				}
			}
			case 7->{
				System.out.println("Enter salary");
				double sal=sc.nextDouble();
				boolean status=eservice.deleteBySal(sal);
				if(status) {
					System.out.println("deleted successfully");
					
				}
				else {
					System.out.println("Not found");
				}
			}
			case 8->{
				 System.out.println("Enter salary");
				    double sal = sc.nextDouble();
				Set<Employee> eset = eservice.displayBySal(sal);
			if (eset.isEmpty()) {
			    System.out.println("Not found");
			} else {
			    eset.forEach(System.out::println);
			}
			}
			case 9->{
				List <Employee> elist=eservice.sortBySal();
				elist.forEach(System.out::println);
				
			}
			case 10->{
				
			}
			case 11->{
				
			}
			
			case 12->{
				sc.close();
				System.out.println("Thank you for visiting.....");
			}
			default->{
				System.out.println("wrong choice");
			}	
			}
		}while(choice!=12);
		
		
	}
	}
