package sel.bootcamp.part1_MediumSection;

public class I_BinarySearch {
	
	public static void main(String[] args) {
		int[] array = { 2, 3, 4, 10, 40, 50, 60, 70, 80};
		int target = 70;

		int result = binarySearch(array, target);

		if (result == -1) {
			System.out.println("Element not present in the array.");
		} else {
			System.out.println("Element found at index " + result);
		}
	}
	
	public static int binarySearch(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int mid = left + ((right - left) / 2); // Find the middle element
			
			// Check if the target is present at mid
			if (array[mid] == target) {
				return mid;
			}

			// If target is greater, ignore the left half
			if (array[mid] < target) {
				left = mid + 1;
			}
			// If target is smaller, ignore the right half
			else {
				right = mid - 1;
			}
		}

		// Target is not present in the array
		return -1;
	}
}
