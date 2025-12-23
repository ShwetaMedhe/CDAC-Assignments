package com.demo.search;

public class SearchingService {

	//sequential search
	public static int SequentialSearch(int[] arr,int search) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				return i;
			}
		}
		return -1;
	}
	
	//non recursive binary search
	public static int binarySearchNonRecurssive(int[]arr, int search) {
		int low=0;
		int high=arr.length-1;
		int cnt=0;
		while(low<=high) {
			int mid=(low+high)/2;
			cnt++;
			if(arr[mid]==search) {
				System.out.println("comarisons are: "+ cnt);
				return mid;
			}
			if(search<arr[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
			
		}
		System.out.println("comparisons are: "+ cnt);
		return -1;
	}
	
	//recursive binary search
	public static int binarySearchRecurssive(int[]arr,int search,int low, int high) {
		System.out.println("binary search called "+low+"------"+high);
		if(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==search) {
				return mid;
			}else if(search<arr[mid]) {
				return  binarySearchRecurssive(arr,search,low,mid-1);
			}else {
				return  binarySearchRecurssive(arr,search,mid+1,high);
			}
		}
		return -1;
	}
}
