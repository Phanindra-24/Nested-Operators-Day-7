package com.codegnan.operatorsexamples;

import java.util.Scanner;

public class CalculatingRemainingAmount {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Purchase Amount");
		double purchaseAmount = scanner.nextDouble();
		double discount = (purchaseAmount > 100)?0.2:(purchaseAmount >=50)?0.1:0.0;	
		double discountAmount=purchaseAmount*discount;
		double remainingAmount=purchaseAmount-discountAmount;
		double percentDiscount=discount*100;
		System.out.println("Amount after applying"+percentDiscount+"% discount"+remainingAmount);
		System.out.println("Discount applied  : "+discountAmount);
				scanner.close();
				
				
	}

}
