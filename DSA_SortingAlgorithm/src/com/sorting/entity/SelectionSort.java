package com.sorting.entity;

public class SelectionSort {
	
	public static void sort(int arr[]) {
		
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			int smallelement = i;
			
			for(int j = i + 1 ; j < arr.length ; j++) {
				if(arr[j] < arr[smallelement]) {
					smallelement = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[smallelement];
			arr[smallelement] = temp;
		}
	}
}
