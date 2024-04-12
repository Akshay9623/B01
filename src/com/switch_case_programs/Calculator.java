package com.switch_case_programs;

import java.util.Scanner;

public class Calculator {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the calculator..!");
		System.out.println("Enter The First Number");
		double first =sc.nextDouble();
		System.out.println("Enter The Second Number");
		double second =sc.nextDouble();
		System.out.println("Select Opration");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		int choice = sc.nextInt();
		double result;
		switch (choice)
		{
		case 1:
			result = first + second;
			System.out.println("Result "+result);
			break;
		case 2:
			result = first-second;
			System.out.println("Result "+result);
			break;
		default:
			System.out.println("Invalid Choice");
		}
		sc.close();
	}
	
}
