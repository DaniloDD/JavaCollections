package sel.bootcamp.part1_MediumSection;

public class E_SecondHighestNumber {
	
	public static void main (String [] args) {
	
		int[] numbers = {1, 10, 2, 9, 3, 8};
		if (numbers.length <2) {
			System.out.println("Array must contains more elements.");
			return;
		}
		//int secondHighest = findSecondHighest(numbers);
		//System.out.println("The second highest number is: " + secondHighest);
	}
	/*
	public static int findSecondHighest(int[] num) {
		
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		// for each number inside the array received in the parameters
		for (int number: num) {
			if (number > highest) {
				secondHighest = highest;
				highest = number;
			}
			else if(number > secondHighest && number != highest) {
				secondHighest = number;
			}
		}
		
		if (secondHighest == Integer.MIN_VALUE) {
			System.out.println("There is no second highest num in the array");
		}
		else {
			System.out.println("The second highest number is: " + secondHighest);
		}
		
	}
	*/
}