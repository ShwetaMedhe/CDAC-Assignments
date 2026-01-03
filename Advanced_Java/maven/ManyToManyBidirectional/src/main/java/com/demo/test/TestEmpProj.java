package com.demo.test;



import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public class TestEmpProj {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Employee e1=new Employee(1,"Shruti",LocalDate.of(2025, 01, 05),12345);
		Employee e2=new Employee(2,"Shweta",LocalDate.of(2024, 04, 12),23415);
		Employee e3=new Employee(3,"Srushti",LocalDate.of(2025, 10, 15),34213);
		Employee e4=new Employee(4,"Shivani",LocalDate.of(2024, 11, 11),12345);
		
		Set<Employee> eset1=new HashSet<>();
		eset1.add(e1);
		eset1.add(e2);
		eset1.add(e3);
		
		Set<Employee> eset2=new HashSet<>();
		eset2.add(e4);
		eset2.add(e2);
		eset2.add(e3);
		
		Project p1=new Project(11,"p1",LocalDate.of(2023,04,15),eset1);
		Project p2=new Project(12,"p2",LocalDate.of(2024,10,01),eset2);
		Project p3=new Project(13,"p3",LocalDate.of(2022,03,30),eset1);
		Set<Project> pset1=new HashSet<>();
		pset1.add(p1);
		pset1.add(p3);
		e1.setPset(pset1);
		Set<Project> pset2=new HashSet<>();
		pset2.add(p1);
		pset2.add(p2);
		pset2.add(p3);
		e2.setPset(pset2);
		e3.setPset(pset2);
		Set<Project> pset3=new HashSet<>();
		pset3.add(p2);
		e4.setPset(pset3);
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		tr.commit();
		session.close();
		sf.close();
		
	}

}
