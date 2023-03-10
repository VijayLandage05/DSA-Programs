package com.sorting.entity;

public class InsertionSort {
	
	public static void sort(int arr[]) {
		
		for(int i = 1 ; i < arr.length ; i++) {
			int j = i - 1 ;
			int element = arr[i];
			
			while (j > -1 && arr[j] > element) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = element;
		}
	}
}
