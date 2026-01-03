package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Employee;
import com.demo.beans.HelloWorld;
import com.demo.beans.MyUser;

public class TestHelloWorld {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		HelloWorld hwbean=(HelloWorld) ctx.getBean("hw");
		String msg=hwbean.sayHello();
		
		Employee e=(Employee) ctx.getBean("emp2");
		System.out.println(e);
	    System.out.println("Message : "+msg);
	     
		MyUser u1=(MyUser) ctx.getBean("u1");
		System.out.println(u1);
		System.out.println(msg);
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
