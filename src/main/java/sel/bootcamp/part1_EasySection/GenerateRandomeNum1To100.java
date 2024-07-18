package sel.bootcamp.part1_EasySection;

import java.util.Random;

public class GenerateRandomeNum1To100 {
	
	public static void main (String [] args) {
		Random random = new Random();
		int randomNum = random.nextInt(100)+1;	// the +1 is put to avoid the selection of 0, 
												// while for 100 as a parameter is not included in the selection
		System.out.println("The random number between 1 and 100 is: " + randomNum);
	}
}