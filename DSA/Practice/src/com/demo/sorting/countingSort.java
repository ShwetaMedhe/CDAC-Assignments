package com.demo.sorting;import java.lang.reflect.Array;
import java.util.Arrays;

public class countingSort {
	private static int findmax(int[] arr) {
		int max=arr[0];
		for(int i=1; i<arr.length;i++) {
			if(max<arr[i]) {
				max= arr[i];
			}
			
		}
		return max;
	}

	public static int[] countSort(int []arr) {
		int max= findmax(arr);
		
		int[] count = new int[max+1];
		for(int i=0; i<count.length; i++) {
			count[i]=0;
		}
		
		for(int i=0;i<arr.length;i++) {
			int pos=arr[i];
			count[pos]++;
		}
		System.out.println("count array");
		System.out.println(Arrays.toString(count));
		
		for(int i=1;i<count.length;i++) {
			count[i]=count[i]+count[i-1];
		}
		
		System.out.println("cummulative sum");
		System.out.println(Arrays.toString(arr));
		
		int[] output=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int pos=arr[i];
			count[pos]--;
			int idx=count[pos];
			output[idx]=arr[i];
			
		}
		System.out.println("output array");
		System.out.println(Arrays.toString(arr));
		return output;
	}
	
	
}
