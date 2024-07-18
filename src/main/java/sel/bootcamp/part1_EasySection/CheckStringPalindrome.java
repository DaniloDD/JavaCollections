package sel.bootcamp.part1_EasySection;

import java.util.Scanner;

public class CheckStringPalindrome {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word:");
		String s = scan.nextLine();
		
		if (isPalindrome(s)) {
			System.out.println("The word is palindrome");
		}
		else {
			System.out.println("The world is not palindrome");
		}
		scan.close();
	}
	
	public static boolean isPalindrome(String s) {
		
		// convert all letters to lower case
		String string = s.toLowerCase();		
		System.out.println(string);
		int leftPointerIndex = 0;
		int rightPointerIndex = string.length()-1;
		
		while (leftPointerIndex < rightPointerIndex) {
			if (string.charAt(leftPointerIndex) != string.charAt(rightPointerIndex)) {
				return false;
			}
			leftPointerIndex++;
			rightPointerIndex--;
		}
		return true;
	}
}

