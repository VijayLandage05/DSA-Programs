package com.recursion.main;

import java.util.Scanner;

import com.recursion.entity.SumOf10EvenNumbers;

public class SumOf10EvenNumbersMain {

	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int value = 2*x;
		int ans = SumOf10EvenNumbers.sum(value);
		System.out.println("Sum of first "+x+"natural numbers is :"+ ans);
	}
}
