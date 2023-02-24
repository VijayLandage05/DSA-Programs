package com.recursion.entity;

public class TailRecursionDemo {
	public static void fun(int n) {
		
		if(n>0) {
			System.out.print(n+" ");
			fun(n-1);
		}
	}
}







