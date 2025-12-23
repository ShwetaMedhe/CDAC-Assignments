package com.demo.test;

import com.demo.search.SearchingService;

public class TestSearch {

	public static void main(String[] args) {
		int[] arr= {10,5,4,7,8,3,2,15};
		int pos=SearchingService.SequentialSearch(arr, 7);
		if(pos!=-1) {
			System.out.println("number found at position:"+pos);
		}else {
			System.out.println("not found");
		}
		
		int[]arr1= {12,13,16,31,32,17,19};
		pos=SearchingService.binarySearchNonRecurssive(arr1, 15);
		if(pos!=-1) {
			System.out.println("binary search number found at position: "+pos);
			
		}else {
			System.out.println("binary search number not found");
		}
		
		pos=SearchingService.binarySearchRecurssive(arr1, 10, 0, 10);
		if(pos!=-1) {
			System.out.println("binary search number found at position: "+pos);
			
		}else {
			System.out.println("binary search number not found");
		}
	}

}
