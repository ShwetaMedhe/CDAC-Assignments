package com.demo.test;

import com.demo.sorting.MergeSort;

public class TestMergeSort {
	public static void main(String[] args) {
		int[] arr= {15,12,3,4,7,17,18,5,20,25};
		MergeSort.mergeSortAscending(arr, 0,arr.length-1);
	}
	
}
