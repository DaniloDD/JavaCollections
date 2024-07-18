package sel.bootcamp.part1_EasySection;

import java.util.Scanner;

public class SumOfTwoNum {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int firstNum = scan.nextInt();
		
		System.out.println("Enter the second number");
		int secondNum = scan.nextInt();
		
		int sum = firstNum + secondNum;
		
		System.out.println("The sum is " + sum);
		
		scan.close();
	}
}