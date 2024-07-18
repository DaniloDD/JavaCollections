package sel.bootcamp.part1_MediumSection;

import java.util.Scanner;

public class D_ReverseString {
	
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word:");
		String s = scan.nextLine();
		
		String sReversed = reverseString(s);
		System.out.println("The reversed string is: " + sReversed);
		
		scan.close();
	}
	
	public static String reverseString(String str) {
		char[] reversedArray = new char[str.length()];
		
		for (int i = 0; i<str.length(); i++) {
			reversedArray[i] = str.charAt(str.length()-1-i);
		}
		return new String(reversedArray);
	}
}