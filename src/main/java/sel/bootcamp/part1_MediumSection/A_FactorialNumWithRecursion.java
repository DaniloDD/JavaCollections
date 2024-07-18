package sel.bootcamp.part1_MediumSection;

import java.util.Scanner;

public class A_FactorialNumWithRecursion {
	// Factorial n!=n×(n−1)! > 0
	// Recursion is a programming technique where a function calls itself in order to solve a problem
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		long factorial = calculateFactorial(num);
		System.out.println("The factorial of " + num + " is: " + factorial);
		scan.close();
	}
	
	public static long calculateFactorial(int n) {
		if (n == 0) {							// base case = 1
			return 1;							
		}
		else {
			return n*calculateFactorial(n-1); 	// recursion
		}
	}
}
