package sel.bootcamp.part1_DifficultSection;

public class G_MaximumSubarraySum {

// find the maximum possible sum you can get from one of its contiguous subArrays ()

    public static int maxSubArraySum(int[] inputArray) {
        int max_sum = inputArray[0];
        int current_sum = max_sum;

        for (int i = 1; i <inputArray.length; i++) {
        	// do we want to add the current_sum to our subArray or do we want to start a new subArray sum?
        	current_sum = Math.max(current_sum + inputArray[i], inputArray[i]);
        	// if the current_sum is greater than the max_sum, than we updated the max_sum with the current
        	max_sum = Math.max(current_sum, max_sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum is: " + maxSubArraySum(nums));
    }
}
