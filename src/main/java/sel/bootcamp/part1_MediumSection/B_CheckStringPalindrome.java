package sel.bootcamp.part1_MediumSection;

import java.util.Scanner;

public class B_CheckStringPalindrome {
	
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String s = scan.nextLine();
		
		if(isPlaindrome(s)) {
			System.out.println("The word is palindrome");
		}
		else {
			System.out.println("The word is not palindrome");
		}
		scan.close();
	}
	
	public static Boolean isPlaindrome(String str) {
		
		String string = str.toLowerCase();
		int leftPointerIndex =0;
		int rightPointerIndex = str.length()-1;
		
		while (leftPointerIndex<rightPointerIndex) {
			if (string.charAt(leftPointerIndex) != string.charAt(rightPointerIndex)) {
				return false;
			}
			leftPointerIndex++;
			rightPointerIndex--;
		}
		return true;
	}
}
