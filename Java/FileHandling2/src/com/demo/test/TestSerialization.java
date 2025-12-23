package com.demo.test;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class TestSerialization {

	public static void main(String[] args) {
		List<Employee> lst=new ArrayList<>();
		lst.add(new Employee(11,"Ashwini","HR",21244));
		lst.add(new Employee(12,"Nandini","Manager",63210));
		lst.add(new Employee(13,"Sakshi","Developer",55289));
		lst.add(new Employee(14,"Nilesh","Tester",12359));
    
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("EmpSerialization.txt"));){
			for(Employee e:lst) {
				oos.writeObject(e);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
			
		}
		
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("EmpSerialization.txt"))){
			while(true) {
				Employee e=(Employee)ois.readObject();
				System.out.println(e);
		}
	} catch(EOFException e) {
		System.out.println("Reached to end of the file.......");
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}catch(ClassNotFoundException e1) {
		e1.printStackTrace();
	}
		
	}

}
