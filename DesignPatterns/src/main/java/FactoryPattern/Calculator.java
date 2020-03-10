package FactoryPattern;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		float num1 = s.nextFloat();
		System.out.println("Enter 2nd number: ");
		float num2 = s.nextFloat();
		System.out.println("Choose any one from the below operations:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		int choose = s.nextInt();
		Cal_Factory factory = new Cal_Factory();
		Calculate cal =  factory.operations(choose);
		cal.calculate(num1, num2);
		
	}
}