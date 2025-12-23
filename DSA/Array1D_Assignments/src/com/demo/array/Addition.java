package com.demo.array;

//Find addition of digits of all every individual number in the array
public class Addition {
	public int getDigitSum(int num) {
		int sum=0;
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
		}
		return sum;
	}


}



