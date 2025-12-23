package com.demo.enums;

public enum Coffee {
	small(150,150.00),medium(200,359.70),Large(200,250.00);
	private int size;
	private double price;
	private Coffee(int size, double price) {
		System.out.println("in coffee constructor "+size+"----"+price);
		this.size=size;
		this.price=price;
	
	}
	public int getSize() {
		return size;
	}
	 public double getPrice() {
		 return price;
	 }

}
