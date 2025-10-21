package com.codegnan.operatorsexamples;

import java.util.Scanner;

public class TempreatureClassification {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temperature:");
		int temperature = scanner.nextInt();
		String classification = (temperature >= 30)?"Hot":(temperature >= 15)?"Moderate":"Cold";
		System.out.println("temperature is:"+classification);
		scanner.close();

	}

}
