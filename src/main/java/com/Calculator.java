package com;

public class Calculator {
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int subtract(int a, int b) {
		return a-b;
	}
	
	public static void main(String args[]) {
		System.out.println("Sum of 10 and 20 is"+add(10,20));
		System.out.println("Subtraction of 10 and 20 is"+subtract(10,20));
	}
}
