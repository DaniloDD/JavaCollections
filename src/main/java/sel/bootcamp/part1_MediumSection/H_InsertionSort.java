package sel.bootcamp.part1_MediumSection;

public class H_InsertionSort {

	// Insertion sort is a simple sorting algorithm that builds the final sorted
	// arrat one item at a time.
	// It iterates through the input list, removing one element and then inserting
	// it into its correct position in the sorted part of the list.

	public static void main(String[] args) {
		int[] arr = { 10, 24, 3, 2, 1, 8, 5 };
		for (int num : arr) {
			System.out.print(num + " ");
		}

		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;

		}
		
		System.out.println("The Array sorted with the insertion algorithm is:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}