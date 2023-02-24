package com.recursion.entity;

public class HeadRecursion {
	public static void fun(int n) {
		if(n<10) {
			fun(n+1);
			System.out.println(n);
		}
	}
}
