import java.util.Arrays;

public class search {
    public static int searchInsert(int[] nums, int target) {
        // Sort the array before performing binary search
        Arrays.sort(nums);

        int left = 0, right = nums.length - 1;
        
        // Binary search for the target
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left;  // Return the index where the target should be inserted
    }

    public static void main(String[] args) {
        //search sol = new search();
        int[] nums = {6, 3, 5, 1};  // Unordered array
        int target = 5;
        
        int result = searchInsert(nums, target);
        System.out.println("Index to insert target: " + result);
    }
}

