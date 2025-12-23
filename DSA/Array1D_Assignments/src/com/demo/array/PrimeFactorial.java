package com.demo.array;

public class PrimeFactorial {
	public boolean isPrime(int num) {
		if(num<=1) {
			return false;
			
		}
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				return true;
			}
			
		}
		return false;
	}
	
	public int factorial(int num) {
		int fact=1;
		for(int i=2;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
		
	}
}
