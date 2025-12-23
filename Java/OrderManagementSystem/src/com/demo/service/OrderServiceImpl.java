package com.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import com.demo.dao.OrderDao;
import com.demo.dao.OrderDaoImpl;
import com.demo.beans.Customer;
import com.demo.beans.Item;
import java.util.ArrayList;

public class OrderServiceImpl implements OrderService {
	private OrderDao odao;

	public OrderServiceImpl() {
		super();
		odao=new OrderDaoImpl();
	}

	@Override
	public boolean addNewCustomer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id: ");
		int cid =sc.nextInt();
		System.out.println("Enter Name: ");
		String nm=sc.next();
		System.out.println("Enter Mobile Number");
		String mob=sc.next();
		
		Customer c = new Customer(cid , nm, mob);
		List <Item> lst = new ArrayList<>();
		String ans=null;
		do {
			System.out.println("Enter Item Id");
			int id = sc.nextInt();
			System.out.println("Enter Item Name");
			String inm = sc.next();
			System.out.println("Enter The qty");
			int qty = sc.nextInt();
			System.out.println("Enter the price");
			double price=sc.nextDouble();
			Item item=new Item(id,inm,qty,price);
			lst.add(item);
			System.out.println("Do you want to add more(y/n)");
			ans=sc.next();
			
			
		}while(ans.equals("y"));
		return odao.save(c,lst);
	
	}

	@Override
	public Map<Customer, List<Item>> displayAll() {
		return odao.findAll();
	}

	@Override
	public Entry<Customer, List<Item>> findByCustomer(int cid) {	
		return odao.findById(cid);
	}

	@Override
	public boolean deleteById(int cid) {
		return odao.removeById(cid);
	}

	@Override
	public boolean addNewItem(int cid, Item item) {
		return odao.addNewItem(cid,item);
	}

	@Override
	public boolean removeItemById(int cid, int iid) {
		return odao.deleteById(cid,iid);
		}

	
}
