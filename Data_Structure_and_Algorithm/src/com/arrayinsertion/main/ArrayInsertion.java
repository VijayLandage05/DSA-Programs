package com.arrayinsertion.main;

import java.util.Scanner;

public class ArrayInsertion {

	public static void main(String[] args) {
		
		int [] arr = new int [15];
		System.out.print("Enter the elements of the array : ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length-5;i++) {
		arr[i] = sc.nextInt();
		}
		System.out.println("Elements before insertion of new element : ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Enter the location at which you want to insert new element :");
		int location=sc.nextInt();
		
		System.out.println("Enter the value which you want to insert at that position :");
		int newvalue=sc.nextInt();
		
		for(int i=arr.length-1;i>location;i--) {
			arr[i]=arr[i-1];
		}
		arr[location]=newvalue;
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
