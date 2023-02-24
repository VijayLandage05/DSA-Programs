package com.sequentialdemo.main;

import java.util.Scanner;

public class SequentialMain {

	public static void main(String[] args) {

		int [] arr = {15,32,24,67,49,10};

		System.out.print("Enter the element to be searched : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int position = search(number, arr);

		if(position>0)
			System.out.println("Element is found at position : "+(position+1));
		else 
			System.out.println("Element not found");

	}
	static int search(int element, int arr[]) {

		for(int i=0; i<arr.length; i++) {
			if(arr[i] == element) 
				return i;
		}
		return -1;
	}
}

