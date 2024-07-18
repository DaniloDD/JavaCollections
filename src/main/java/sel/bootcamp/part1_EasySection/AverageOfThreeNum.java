package sel.bootcamp.part1_EasySection;

import java.util.Scanner;

public class AverageOfThreeNum {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		double firstNum = scan.nextDouble();
		System.out.println("Enter the second number:");
		double secondNum = scan.nextDouble();
		System.out.println("Enter the thrid number:");
		double thirdNum = scan.nextDouble();
		
		double average = (firstNum + secondNum + thirdNum) / 3;
		System.out.println("The average sum of the three numbers is : " + average);	
		scan.close();
	}
}