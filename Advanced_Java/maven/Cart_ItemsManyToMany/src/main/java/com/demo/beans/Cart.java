package com.demo.beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Cart {
	@Id
	private int cartId;
    private int userId;
    private double totalAmount;
    @ManyToMany(cascade = CascadeType.ALL)
    Set<Items> iset;
	public Cart() {
		super();
	}
	public Cart(int cartId, int userId, double totalAmount, Set<Items> iset) {
		super();
		this.cartId = cartId;
		this.userId = userId;
		this.totalAmount = totalAmount;
		this.iset = iset;
	}
	
	
	public Cart(int cartId, int userId, double totalAmount) {
		super();
		this.cartId = cartId;
		this.userId = userId;
		this.totalAmount = totalAmount;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Set<Items> getIset() {
		return iset;
	}
	public void setIset(Set<Items> iset) {
		this.iset = iset;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", userId=" + userId + ", totalAmount=" + totalAmount + ", iset=" + iset
				+ "]";
	}
    
    
    
}
