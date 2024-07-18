package sel.bootcamp.part1_MediumSection;

import java.util.Scanner;

public class G_SelectionSort {

// Selection sort is a simple sorting algorithm that repeatedly finds the minumum (or maximum, depending on sorting order) 
// element from the unsorted part of the array and swaps it with the element at the current position.

	public static void main(String[] args) {

		System.out.println("Enter how many elements you want to order:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];

		System.out.println("Inster the " + n + " elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int minIndex = i;
			// Find the minimum element in unsorted array
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			// Swap the found minimum element with the first element of the unsorted array
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		
		for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
		scan.close();
	}
}