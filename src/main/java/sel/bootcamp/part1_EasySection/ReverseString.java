package sel.bootcamp.part1_EasySection;

import java.util.Scanner;

public class ReverseString {

	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert word to reverse:");
	    
		String s = scan.nextLine();
		System.out.println("The reversed word is: " + reverseStringUsingForCycle(s));
		
		scan.close();
	}
	
	public static String reverseStringUsingBuilder(String s) {
		StringBuilder reversed = new StringBuilder(s);
		return reversed.reverse().toString();
	}
	
	public static String reverseStringUsingForCycle(String s) {
		String reversed = "";
		for (int i = 0; i<s.length(); i++) {
			reversed = reversed + s.charAt(s.length()-1-i);
		}
		return reversed;
	}
	
}