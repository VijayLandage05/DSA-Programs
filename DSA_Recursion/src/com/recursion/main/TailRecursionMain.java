package com.recursion.main;

import java.util.Scanner;

import com.recursion.entity.TailRecursionDemo;

public class TailRecursionMain {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		TailRecursionDemo.fun(x); 
	}
}
