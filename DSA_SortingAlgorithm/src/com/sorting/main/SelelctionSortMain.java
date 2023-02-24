package com.sorting.main;

import java.util.Arrays;

import com.sorting.entity.SelectionSort;

public class SelelctionSortMain {

	public static void main(String[] args) {
		
		SelectionSort obj = new SelectionSort();
		
		int [] arr = {26, 54, 93, 17, 77, 31, 44, 55, 20};
		System.out.println("Original array is : "+Arrays.toString(arr));
		System.out.println();
		
		obj.sort(arr);
		
		System.out.print("All elements in the array in sorted order are : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
