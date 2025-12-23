package com.demo.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class TestReadCSV {

	public static void main(String[] args) {
		List<Employee> lst=new ArrayList<>();
		try (
			BufferedReader br=new BufferedReader(new FileReader("empdata.txt"));
			
				){
				String line=br.readLine();
				while(line!=null) {
					String[] arr=line.split(",");
					
					Employee emp=new Employee();
					emp.setEid(Integer.parseInt(arr[0]));
					emp.setEname(arr[1]);
					emp.setDesg(arr[2]);
					emp.setSal(Double.parseDouble(arr[3]));
					lst.add(emp);
					line=br.readLine();
					
				}
				lst.forEach(System.out::println);
				
				}catch (FileNotFoundException e) {
					e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		lst.add(new Employee(34,"xxxx","admin",4528));
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("empdata.txt"));){
			
			for(Employee e:lst) {
				String str=e.getEid()+","+e.getEname()+","+e.getDesg()+","+e.getSal()+"\n";
				bw.write(str);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
