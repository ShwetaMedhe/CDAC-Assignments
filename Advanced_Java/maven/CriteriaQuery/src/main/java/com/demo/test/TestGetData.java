package com.demo.test;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;

public class TestGetData {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Employee> cq=cb.createQuery(Employee.class);
		Root<Employee> root=cq.from(Employee.class);
		
		//fetch employees with salary>50000 and dept="HR"
//		cq.select(root)
//		.where(cb.or(
//				cb.equal(root.get("age"),25),
//				cb.equal(root.get("dept"),"UX")
//				));
//		List<Employee> elist=session.createQuery(cq).getResultList();
//		elist.forEach(System.out::println);
		
		
		
		tr.commit();
		session.close();
		sf.close();
	}

}
