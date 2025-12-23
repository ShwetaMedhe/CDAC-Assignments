package com.demo.test;

import java.util.Scanner;

import com.demo.array.Addition;

public class TestAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Addition addition=new Addition();
		
		System.out.println("Enter number of elements: ");
		int size=sc.nextInt();
		int[] num=new int[size];
		
		System.out.println("Enter"+size+" numbers");
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		
		System.out.println("Sum is: ");
        for (int number : num) {
            int sum = addition.getDigitSum(number);
            System.out.println(number + " → " + sum);
        }

        sc.close();
    }

	}


