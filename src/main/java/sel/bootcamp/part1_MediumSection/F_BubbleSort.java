package sel.bootcamp.part1_MediumSection;
import java.util.Scanner;

// Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements,
// and swaps them if they are in the wrong order.

public class F_BubbleSort {
	
	public static void main (String[] args) {
		
		System.out.println("Enter the number of elements in the array:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements:");
		for (int i=0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("The array before the bubblesort is:");
		printArray(arr);
		System.out.println("The array after sorting is: ");
		bubblesort(arr);
		printArray(arr);
		
		scan.close();
	}
	
	public static void bubblesort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j< arr.length-1-i; j++) {
				if (arr[j]> arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}