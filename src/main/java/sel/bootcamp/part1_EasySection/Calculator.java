package sel.bootcamp.part1_EasySection;

import java.util.Scanner;

public class Calculator {
	
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Simple calculator");
		System.out.println("Choose an operation:");
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		System.out.println("Enter your choice number(1-4):");
		int choice = scan.nextInt();
		
		System.out.println("Enter first number: ");
		double firstNum = scan.nextDouble();
		System.out.println("Enter second number: ");
		double secondNum = scan.nextDouble();
		
		double result = 0;
		
		switch(choice) {
		case 1:
			result = firstNum + secondNum;
			System.out.println("The result is:");
			System.out.println(result);
			break;
		case 2:
			result = firstNum - secondNum;
			System.out.println("The result is:");
			System.out.println(result);
			break;
		case 3:
			result = firstNum * secondNum;
			System.out.println("The result is:");
			System.out.println(result);
			break;
		case 4:
			result = firstNum / secondNum;
			System.out.println("The result is:");
			System.out.println(result);
			break;
		}
		scan.close();
	}
}