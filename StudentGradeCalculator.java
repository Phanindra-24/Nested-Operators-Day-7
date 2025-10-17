package com.codegnan.operatorsexamples;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Marks");
		int marks = scanner.nextInt();
		char grade =(marks)>=90?'A':(marks >= 80)?'B':(marks >= 70)?'C':(marks > 60)?'D':(marks >= 50)?'E':'F';
		System.out.println("Student grade is"+grade);
		scanner.close();

	}

}
