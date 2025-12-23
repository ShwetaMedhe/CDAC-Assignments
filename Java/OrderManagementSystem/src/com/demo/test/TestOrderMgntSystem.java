package com.demo.test;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Customer;
import com.demo.beans.Item;
import com.demo.service.OrderService;
import com.demo.service.OrderServiceImpl;
public class TestOrderMgntSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		OrderService oservice=new OrderServiceImpl();
		int choice=0;
		do {
			System.out.println("1. add new customer\n2. display all\n3. display by customer");
			System.out.println("4. delete customer\n5. add a new item in existing order");
			System.out.println("6. delete item from existing order\n7.exit\n choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1-> {
			boolean status=oservice.addNewCustomer();
			if(status) {
				System.out.println("Added successfully");
			}else {
				System.out.println("Not added");
			}
		
		}
		case 2-> {
			Map<Customer,List<Item>> omap=oservice.displayAll();
			Set<Customer> keys=omap.keySet();
			keys.forEach(c->System.out.println(c+"----->"+omap.get(c)));
					
		}
		case 3-> {
			System.out.println("Enter customer Id");
			int cid=sc.nextInt();
			Map.Entry<Customer, List<Item>> data=oservice.findByCustomer(cid);
			if(data!=null) {
				System.out.println(data.getKey()+"------->"+data.getValue());
			}else {
				System.out.println("Not Found");
			}
			
	
		}
		case 4-> {
			System.out.println("Enter customer id");
			int cid=sc.nextInt();
			boolean status=oservice.deleteById(cid);
			if(status) {
				System.out.println("deleted successfully");
			}else {
				System.out.println("not found");
			}
		}
		case 5-> {
			System.out.println("Enter customer id");
			int cid=sc.nextInt();
			System.out.println("Enter item id");
			int iid=sc.nextInt();
			System.out.println("Enter item name");
			String inm=sc.next();
			System.out.println("Enter qty");
			int qty=sc.nextInt();
			System.out.println("Enter item price");
			double price=sc.nextDouble();
			boolean status=oservice.addNewItem(cid,new Item(iid,inm,qty,price));
			if(status) {
				System.out.println("added successfully");
			}else {
				System.out.println("not found");
			}
		}
		case 6-> {
			System.out.println("Enter customer id");
			int cid=sc.nextInt();
			System.out.println("Enter Item id");
			int iid=sc.nextInt();
			boolean status =oservice.removeItemById(cid,iid);
			if(status) {
				System.out.println("deleted successfully");
				
			}else {
				System.out.println("Not Found");
			}
		}
		case 7-> {
			sc.close();
			System.out.println("Thank You For Visiting.......");
			
		}
		default->{
			System.out.println("Wrong Choice");
		}
	}
	 
			

}while(choice!=7);
		}
		
			

}
