package com.codegnan.operatorsexamples;

import java.util.Scanner;

public class AccountBalanceCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the account balance:");
		double balance = scanner.nextDouble();
		String status = (balance >= 1000)?"Good Standing":(balance >= 500)?"Low Balance":"Account Overdrawn";
		System.out.println("Account status:" + status);
		scanner.close();

	}

}
