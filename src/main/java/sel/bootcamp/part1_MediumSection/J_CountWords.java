package sel.bootcamp.part1_MediumSection;

import java.util.Scanner;

public class J_CountWords {
	
	public static void main (String[] args) {
		
		System.out.println("Inster string:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int wordCount = countWordsInAString(str);
		System.out.println("The number of words in the string is: " + wordCount);
		scan.close();
	}
	
	public static int countWordsInAString(String str) {
	
		if (str == null || str.isEmpty()) {
			return 0;
		}
		
		String[] words = str.trim().split("\\s+");
		return words.length;
	}
}