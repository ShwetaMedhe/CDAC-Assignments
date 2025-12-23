package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.countingSort;

public class TestCountingSort {

	public static void main(String[] args) {
		int[] arr= {3,4,1,5,3,7};
		int[] output=countingSort.countSort(arr);
		System.out.println("sorted data");
		System.out.println(Arrays.toString(arr));
	}
}

