package com.demo.test;

import com.demo.sorting.QuickSortAlgorithm;

public class TestQuickSort {

	public static void main(String[] args) {
		int[] arr= {11,23,22,5,1,7,8,10,3,17};
		QuickSortAlgorithm.quicksort(arr,0,arr.length-1);

	}

}
