package com.demo.service;

import com.demo.beans.Product;

public interface ProductService {

	boolean addNewProduct();

	boolean deleteById(int id);

	boolean modifyById(int id, int qty, double price);

	Product getById(int id);

}
