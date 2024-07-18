package sel.bootcamp.part1_DifficultSection;

public class I_ModifiedBinarySearchRotatedSortedArray {

// a sorted array is rotated at some pivot unknown	
// i.e {0, 1, 2, 3, 4, 5, 6, 7} might become {4, 5, 6, 7, 0, 1, 2, 3, 4}
// given a target value to search, if it is found in the array return its index, otherwise return -1
// to be in order of log(n) so we need to use binary search
	

	private static int modBinSearchRotatedSortedArray(int[] arr, int target, int left, int right) {
		
		if (left > right) return -1;
		
		// Avoid overflow, same as (left + right) /2
		int mid = left + ((right -left ) / 2);
		
		if (arr[mid] == target) return mid;		// found
		
		// check if left half is sorted
		if (arr[mid] >= arr[left]) {
			
			// if the key in the left half
			if (arr[left] <= target && target <= arr[mid]) 
				return modBinSearchRotatedSortedArray(arr, target, left, mid -1);
			else 
				return modBinSearchRotatedSortedArray(arr, target, mid+1, right);
		}
		else {
			// if right half is sorted
			
			// if key is in right half
			if (arr[mid] <= target && target <= arr[right])
				return modBinSearchRotatedSortedArray(arr, target, mid+1, right);
			else
				return modBinSearchRotatedSortedArray(arr, target, left, mid-1);
		}		
	}
	
	public static void main(String[] args) {
		int[] arrNum = {7, 8, 9, 0, 1, 2, 3, 4, 5, 6};
		System.out.println("The position of the number is at index: " + modBinSearchRotatedSortedArray(arrNum, 90, 0, arrNum.length-1));
	}
}
