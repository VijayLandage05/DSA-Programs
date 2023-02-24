package com.recursion.entity;

public class SumOf10EvenNumbers {
	
	public static int sum(int n) {
		if(n==0)
			return 0;
		else
			return sum(n-2)+n;
	}
}
