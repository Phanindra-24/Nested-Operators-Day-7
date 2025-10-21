package com.codegnan.operatorsexamples;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your annual income: ");
        double income = sc.nextDouble();
        double taxRate = (income < 300000) ? 0.05
                       : (income <= 1000000) ? 0.10
                       : 0.15;
        double tax = income * taxRate;
        tax = (income > 2000000) ? tax * 1.01 : tax;
        System.out.printf("Income: %.2f\n", income);
        System.out.printf("Tax Rate: %.2f%%\n", taxRate * 100);
        System.out.printf("Total Tax Payable: %.2f\n", tax);

        sc.close();
    }
}

