package com.demo.test;
import java.util.Scanner;

import com.demo.exceptions.WrongNumberException;

public class TestGuessNumber {
	public static void main(String[] args) {
		int num=20;
		Scanner sc=new Scanner(System.in);
		while(true) {
			try {
				System.out.println("Enter a number");
				int num1=sc.nextInt();
				if(num==num1) {
					System.out.println("you guessed it right");
					break;
				}else {
					if(num1<num)
						throw new WrongNumberException("You missed it, it is smaller");
					else
						throw new WrongNumberException("Oops, the number is larger ");
				}
			}catch(WrongNumberException e){
				System.out.println(e.getMessage());
			}
		}
		
	}
}
