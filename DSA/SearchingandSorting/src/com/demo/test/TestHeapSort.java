package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.HeapSort;

public class TestHeapSort {

	public static void main(String[] args) {
		int[] arr= {10,11,12,5,7,3,4};
		HeapSort.heapSortAscending(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("--------------------------");

	}

}
