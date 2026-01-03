package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.MyUser;
import com.demo.beans.Product;

public class TestMyUser {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		MyUser u1=new MyUser(13,"Shweta","sss@gmail.com");
		MyUser u2=new MyUser(13,"Shruti","shr@gmail.com");
		Product p1=new Product("table",21,5400);
		Product p2=new Product("chair",30,2000);
		
		Session session=sf.getCurrentSession();
		Transaction tr=session.beginTransaction();
		session.save(u1);
		session.save(u2);
		session.save(p1);
		session.save(p2);
		tr.commit();
		session.close();
		sf.close();

	}

}
