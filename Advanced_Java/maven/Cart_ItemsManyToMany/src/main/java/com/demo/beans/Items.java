package com.demo.beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Items {
	@Id
    private int itemId;
    private String productName;
    private double price;
    @ManyToMany(mappedBy="iset")
    Set<Cart> cset;
	public Items() {
		super();
	}
	public Items(int itemId, String productName, double price, Set<Cart> cset) {
		super();
		this.itemId = itemId;
		this.productName = productName;
		this.price = price;
		this.cset = cset;
	
	}
	
	public Items(int itemId, String productName, double price) {
		super();
		this.itemId = itemId;
		this.productName = productName;
		this.price = price;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Set<Cart> getCset() {
		return cset;
	}
	public void setCset(Set<Cart> cset) {
		this.cset = cset;
	}
	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", productName=" + productName + ", price=" + price + ", cset=" + cset + "]";
	}
    
}
