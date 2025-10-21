package com.codegnan.operatorsexamples;

import java.util.Scanner;

public class AgeGroup {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = scanner.nextInt();
		String category = (age < 12 )?"Child":(age <= 19)?"Teenager":(age <= 64)?"Adult":"Senior";
		System.out.println("The person is an "+ category +":");
		scanner.close();
		

	}

}
