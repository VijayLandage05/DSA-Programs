package com.sorting.main;

import java.util.Arrays;

import com.sorting.entity.InsertionSort;

public class InsertionSortMain {

	public static void main(String[] args) {
		
		InsertionSort obj = new InsertionSort();
		
		int [] arr = {8, 7, 5, 9, 1, 6, 2, 4, 3};
		System.out.println("Original array is : "+Arrays.toString(arr));
		System.out.println();
		
		obj.sort(arr);
		
		System.out.print("All elements in the array in sorted order is : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
