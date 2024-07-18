package sel.bootcamp.part1_EasySection;

import java.util.Scanner;

public class CheckNumPrime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		
		if(numIsPrime(num)) {
			System.out.println("The number is prime.");
		}
		else {
			System.out.println("The number is not prime.");
		}
		scan.close();
	}
	
	public static boolean numIsPrime(int number) {
		
		if (number <= 1) {
			return false;
		}
		
		for (int i = 2; i<=Math.sqrt(number); i++) {
			if (number% i == 0) {
					return false;
			}
		}
		return true;
	}
}