package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.MyUser;
import com.demo.beans.Product1;

public class TestMyUser {

	public static void main(String[] args) {
		//create a sessionfactory
		//SessionFactory sf=new Configuration().configure("myconfig.config.xml").buildSessionFactory();
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		//create a MyUser object
		//both u1 and u2 are in transient state
		MyUser u1=new MyUser(13,"Shruti", "sh@gmail.com");
		MyUser u2=new MyUser(14,"Shweta", "sss@gmail.com");
		Product1 p1=new Product1("table",23,54000);
		Product1 p2=new Product1("chair",30,4000);
		//Session session=sf.getCurrentSession();
		
		Session session=sf.openSession();
		
		Transaction tr=session.beginTransaction();
		//saving object into session changes the state from transient to persistent
		session.save(u1);
		session.save(u2);
		session.save(p1);
		session.save(p2);
		tr.commit();
		session.close();
		sf.close();
		
	}

}
