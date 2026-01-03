package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Cart;
import com.demo.beans.Items;

public class TestCartItems {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Items i1=new Items(101,"Biscuit",20);
		Items i2=new Items(102,"Book",75);
		Items i3=new Items(103,"Pencil",10);
		Items i4=new Items(104,"Pen",30);
		
		Set<Items> iset1=new HashSet<>();
		iset1.add(i1);
		iset1.add(i2);
		iset1.add(i3);
		
		Set<Items> iset2=new HashSet<>();
		iset2.add(i4);
		iset2.add(i2);
		
		Cart c1=new Cart(1,11,150);
		Cart c2=new Cart(2,12,210);
		Cart c3=new Cart(3,13,180);
		
		Set<Cart> cset1=new HashSet<>();
		cset1.add(c1);
		cset1.add(c3);
		i1.setCset(cset1);
		
		Set<Cart> cset2=new HashSet<>();
		cset2.add(c1);
		cset2.add(c2);
		cset2.add(c3);
		i2.setCset(cset2);
		i3.setCset(cset2);
		
		Set<Cart> cset3=new HashSet<>();
		cset3.add(c2);
		i4.setCset(cset3);
		
		c1.setIset(iset1);   // Biscuit, Book, Pencil
		c2.setIset(iset2);   // Pen, Book
		c3.setIset(iset1);   // Biscuit, Book, Pencil

		
		session.save(c1);
		session.save(c2);
		session.save(c3);
		
//		session.save(i1);
//		session.save(i2);
//		session.save(i3);
//		session.save(i4);
		tr.commit();
		session.close();
		sf.close();
	}

}
