package sel.bootcamp.part1_MediumSection;

public class E_SecondHighestNumber {

	public static int findSecondHighest(int[] numbers) {
		// Initialize the first and second highest to minimum integer values
		int firstHighest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int number : numbers) {
			if (number > firstHighest) {
				// Update second highest before changing first highest
				secondHighest = firstHighest;
				firstHighest = number;
			} else if (number > secondHighest && number < firstHighest) {
				// Update second highest if number is between first highest and second highest
				secondHighest = number;
			}
		}

		return secondHighest;
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 5, 20, 8, 25, 20, 25 };
		int secondHighest = findSecondHighest(numbers);

		if (secondHighest == Integer.MIN_VALUE) {
			System.out.println("There is no second highest number.");
		} else {
			System.out.println("The second highest number is: " + secondHighest);
		}
	}
}