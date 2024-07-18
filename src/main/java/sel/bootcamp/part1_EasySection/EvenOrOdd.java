package sel.bootcamp.part1_EasySection;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		if (num%2 == 0) {
			System.out.println("The number entered is even.");
		}
		else {
			System.out.println("The number entered is odd.");
		}		
		scan.close();		
	}
}