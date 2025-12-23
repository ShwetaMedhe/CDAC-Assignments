package com.demo.sorting;

import java.util.Arrays;

public class QuickSort {
	public static int partition(int[]arr,int start, int end) {
		int i=start;
		int j=end;
		int pivot=start;
		
		while(i<j) {
			while(i<j && arr[i]<=arr[pivot]) {
				i++;
			}
			while(i<j && arr[j]>=arr[pivot]) {
				j--;
			
			}
		}
		if(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		if(pivot!=j) {
			int temp = arr[pivot];
			arr[pivot]=arr[j];
			arr[j]=temp;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("pivot position:"+j+"pivot number:"+arr[j]);
		System.out.println(arr[j]+"swapped with "+ arr[pivot]);
		return j;
	}
	
	public static void QuickSortAlgorithm(int[]arr, int start, int end) {
		int p=partition(arr,start,end);
		QuickSortAlgorithm(arr,start,p-1);
		QuickSortAlgorithm(arr,p+1,end);
	}
	
	
}
