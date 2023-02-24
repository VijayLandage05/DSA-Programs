package com.binarysearchdemo.main;

public class BinarySearchMain {
	public static int binarysearch(int[] arr,int search,int low ,int high){ 
		if(high>=low)
		{ int mid=(low+high)/2;
		if(search==arr[mid])
			return mid;
		if(search<arr[mid]) 
			return
				binarysearch(arr,search,low,mid-1);
		if(search>arr[mid]) 
			return
				binarysearch(arr,search,mid+1,high);
		} return -
				1;
	}
	public static void main(String[] args) {
		int[] arr={10,20,30,40,50,60};
		int search=20; int low=0;
		int high=arr.length;
		System.out.println("Search Element: "+search); 
		int result=binarysearch(arr, search, low, high-1);
		if(result>=0)
			System.out.println("Element Found Position: "+(result+1));
		else
			System.out.println("Element Not Found...");
		System.out.println();
		search=76;
		int result1=binarysearch(arr, search, low, high-1);
		System.out.println("Search Element: "+search);
		if(result1>=0)
			System.out.println("Element Found Position:	"+(result1+1));
		else
			System.out.println("Element Not Found...");
	}
}