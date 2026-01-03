package com.demo.dao;

import com.demo.beans.Product;

public interface ProductDao {

	boolean save(Product p);

	boolean removeById(int id);

	boolean modifyById(int id, int qty, double price);

	Product findById(int id);
	
	
}
