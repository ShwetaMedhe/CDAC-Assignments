package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="nonperishable")
public class NonPerishable extends Product1{
	private int guarentee;

	public NonPerishable() {
		super();
	}

	public NonPerishable(int pid, String pname, int qty, double price, LocalDate mfgdate,int guarentee) {
		super(pid, pname, qty, price, mfgdate);
		this.guarentee=guarentee;
	}

	public int getGarentee() {
		return guarentee;
	}

	public void setGarentee(int garentee) {
		this.guarentee = guarentee;
	}

	@Override
	public String toString() {
		return super.toString()+"NonPerishable [guarentee=" + guarentee + "]";
	}

}
