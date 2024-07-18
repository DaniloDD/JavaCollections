package sel.bootcamp.part1_DifficultSection;

public class H_Mergesort {
// merge sort = recursively divide array in 2, sort, and re-combine
// run-time = O(n Log n)
// space complexity = O(n)

	public static void main (String[] args) {
	
		int[] array = {8, 2, 5, 3, 4, 7, 6, 1};
		
		mergeSort(array);
		
		for (int i = 0; i< array.length; i++) {
			System.out.println(array[i] + " ");
		}

	}

	private static void mergeSort(int[] array) {
		int length = array.length;
		// Base case
		if (length<= 1) return;
		
		int middlePosition = length/2;
		int[] leftArray = new int[middlePosition];
		int[] rightArray = new int[length - middlePosition];
		
		// we need to copy the element from the original array to our left and right array, so we create two indicies
		
		int i = 0;	// left array
		int j = 0;	// right array
		
		for (; i< length; i++) {
			if (i < middlePosition) {		// we copy an element from our original array to our left array
				leftArray[i] = array[i];
			}
			else {
				rightArray[j] = array[i];
				j++;
			}
		}
		
		mergeSort(leftArray);
		mergeSort(rightArray);
		mergeHelper(leftArray, rightArray, array);
	
	}
	
	private static void mergeHelper(int[] leftArray, int[] rightArray, int[] array) {
		int leftSize = array.length/2;
		int rightSize = array.length - leftSize;
		int i =0;	// index for original array
		int l =0;	// left array
		int r = 0;	// right array
		
		// check the conditions for mergin
		while (l< leftSize && r< rightSize) {	// while there are elements in our right and left array we will continue to add elements in the original array
			if (leftArray[l] < rightArray[r]) {		// if the number on the left is smaller than the one on the right, we copy it in the original array
				array[i] = leftArray[l];
				i++;
				l++;
			}
			else {
				array[i] = rightArray[r];
				i++;
				r++;
			}
		}
		// loop for the last element remaining that we cannot compare to another element because it's the only one left
		while (l< leftSize) {
			array[i] = leftArray[l];
			i++;
			l++;
		}
		while (r< rightSize) {
			array[i] = rightArray[r];
			i++;
			r++;
		}
	}
}
