package com.demo.dao;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public class OrderDaoImpl implements OrderDao{
	static Map<Customer,List<Item>> hm;
	static {
		hm=new HashMap<>();
		Customer c1=new Customer(10,"Rahul","6768686");
		List<Item> lst=new ArrayList<>();
		lst.add(new Item(100,"laptop",30,30000));
		lst.add(new Item(101,"mouse",33,66878));
		hm.put(c1, lst);
		
		Customer c2=new Customer(11,"Pranav","6742344");
		List<Item> lst1= new ArrayList<>();
		lst1.add(new Item(1001,"table",59,3210));
		lst1.add(new Item(1002,"Chair",45,6712));
		hm.put(c2, lst1);
	}
	@Override
	public boolean save(Customer c, List<Item> lst) {
		if(!hm.containsKey(c)) {
			hm.put(c, lst);
			return true;
		}
		return false;
	}
	@Override
	public Map<Customer, List<Item>> findAll() {
		
		return hm;
	}
	@Override
	public Entry<Customer, List<Item>> findById(int cid) {
	 Set<Map.Entry<Customer,List<Item>>> cset=hm.entrySet();
	 for(Map.Entry<Customer,List<Item>> e:cset) {
			if(e.getKey().getCid()==cid)
				return e;
		}
		return null;
	
	}
	@Override
	public boolean removeById(int cid) {
		List<Item>lst=hm.remove(new Customer(cid));
		return lst!=null;
	}
	@Override
	public boolean addNewItem(int cid, Item item) {
		List<Item> lst=hm.get(new Customer(cid));
		if(lst!=null) {
			lst.add(item);
			return true;
		}
		return false;
	}
	@Override
	public boolean deleteById(int cid, int iid) {
		List<Item> lst=hm.get(new Customer(cid));
		if(lst!=null) {
			return lst.remove(new Item(iid));
		}
		
		return false;
	}
	
}
