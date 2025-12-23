package com.demo.test;

import java.util.stream.IntStream;

import com.demo.arrays.MyArray;

public class TestArray {

	public static void main(String[] args) {
		MyArray ob=new MyArray();
		System.out.println("capacity : " +ob.getCapacity());
		ob.add(4);
		ob.add(7);
		System.out.println(ob);
		ob.add(8, 1);
		System.out.println("position of 4: "+ob.searchByValue(4));
		ob.add(3);
		ob.add(5);
		System.out.println(ob);
		ob.add(1);
		System.out.println(ob);
		ob.deleteByValue(7);
		System.out.println(ob);
		ob.deleteByPos(1);
		System.out.println(ob);
		
		ob.rotateArray(false, 3);
		System.out.println(ob);
		
		int[] arr1=ob.exchangeIndexValue();
		IntStream.of(arr1).forEach(e->System.out.print(e+","));
		arr1=ob.reverseArray(true);
		System.out.println(ob);
		IntStream.of(arr1).forEach(e->System.out.println(e+","));
		ob.rotateArray(false, 3);
		System.out.println(ob);
		

	}

}
