package com.demo.test;

import java.util.Scanner;

import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployee {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		EmployeeService eservice=new EmployeeServiceImpl();
		do {
			System.out.println("1.add new employee\n2. delete employee\n3. modify salary");
			System.out.println("4.find by id\n5. display all\n6. display in sorted order\n7.exit");
			System.out.println("choice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1->{
			boolean status=eservice.addNewEmployee();
			if(status) {
				System.out.println("EMployee added");
			}else {
				System.out.println("not added");
			}
			}
			case 2->{
				System.out.println("enter id");
				int id=sc.nextInt();
				boolean status=eservice.deleteById();
				if(status) {
					System.out.println("employee deleted succesfully");
				}else {
					System.out.println("not deleted");
				}
			}
			}
			
		
			
		}while(choice!=7);
		
	}
}
