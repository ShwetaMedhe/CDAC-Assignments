package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.CountingSort;

public class TestCountingSort {

	public static void main(String[] args) {
		int[] arr= {4,2,2,8,3,3,1};
		int[]output=CountingSort.countingSortAlgorithm(arr);
		System.out.println("sorted data");
		System.out.println(Arrays.toString(output));

	}

}
