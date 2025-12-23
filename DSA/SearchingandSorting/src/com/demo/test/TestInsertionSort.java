package com.demo.test;

import com.demo.sorting.InsertionSort;

public class TestInsertionSort {

	public static void main(String[] args) {
		int[] arr= {11,23,52,78,19,20};
		InsertionSort.insertionSortAscending(arr);
		InsertionSort.insertionDescending(arr);

	}

}
