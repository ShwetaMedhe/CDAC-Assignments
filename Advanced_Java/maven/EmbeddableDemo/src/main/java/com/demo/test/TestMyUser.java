package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.MyUser;

public class TestMyUser {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Session session2=sf.openSession();
		Transaction tr1=session2.beginTransaction();
		System.out.println("before get");
		MyUser u11=session2.get(MyUser.class,12);
		System.out.println("after get");
		System.out.println(u11);
		tr1.commit();
		session2.close();
		sf.close();

	}

}
