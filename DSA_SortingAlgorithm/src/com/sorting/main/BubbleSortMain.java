package com.sorting.main;

import java.util.Arrays;

import com.sorting.entity.BuubleSort;

public class BubbleSortMain {

	public static void main(String[] args) {

		BuubleSort obj = new BuubleSort();
		
		int [] arr = {1,2,3,4,5,6,7};
		System.out.println("Original array is : "+Arrays.toString(arr));
		
		obj.sort(arr);
		
		System.out.println();
		
		System.out.print("All elements in the array in sorted order are : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
