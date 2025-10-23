package com.codegnan.operatorsexamples;

import java.util.Scanner;

public class DiscountCalcualtion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter  Amount :");
		int amount = scanner.nextInt();
		double discountPercent =  (amount >= 1000)?20:(amount >= 500)?10:0;
		double discountAmount = (amount * discountPercent)/100;
		double finalAmount = amount - discountAmount;
		System.out.println("Discount Applied :" + discountPercent);
		System.out.println("Discount Amount :" + discountAmount);
		System.out.println("Final Amount to Pay :" + finalAmount);
		scanner.close();
		
		

	}

}
