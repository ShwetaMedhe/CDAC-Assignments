package com.demo.service;

import java.util.List;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductserviceImpl implements ProductService {
	private ProductDao pdao;
	
	public ProductserviceImpl() {
		pdao=new ProductDaoImpl();
	}
	
	@Override
	public List<Product> getAllProducts() {
		return pdao.findAllProducts();
	}

	@Override
	public boolean addproduct(Product p) {
		return pdao.save(p);
	}

	@Override
	public boolean deleteById(int pid) {
		return pdao.removeById(pid);
	}

	@Override
	public Product getById(int pid) {
		return pdao.findById(pid);
	}

	@Override
	public boolean updateproduct(Product p) {
		// TODO Auto-generated method stub
		return pdao.modifyproduct(p);
	}

}
