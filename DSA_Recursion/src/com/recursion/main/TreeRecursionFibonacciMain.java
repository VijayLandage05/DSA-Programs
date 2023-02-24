package com.recursion.main;

import java.util.Scanner;

import com.recursion.entity.TreeRecursionFibonacci;

public class TreeRecursionFibonacciMain {

	public static void main(String[] args) {
		System.out.print("Enter the number :");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int ans = TreeRecursionFibonacci.fibo(x);
		System.out.println("The sum of fibonacci number "+x+" is :"+ans);
	}
}
