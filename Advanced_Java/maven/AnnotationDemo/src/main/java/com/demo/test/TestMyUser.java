package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.MyUser;
import com.demo.beans.Product1;

public class TestMyUser {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		MyUser u1=new MyUser(102,"Sakshi","sk@gmail.com");
		MyUser u2=new MyUser(103,"Rohit","rrr@gmail.com");
		Product1 p1=new Product1("waffles",23,45);
		Product1 p2=new Product1("nachos",23,123);
		session.save(u1);
		session.save(u2);
		session.save(p1);
		session.save(p2);
		tr.commit();
		session.close();
		sf.close();
		

	}

}
