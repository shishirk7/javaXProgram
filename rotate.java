public class rotate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 5;
        nums = rearrange(nums, k);
        for (int i : nums)
            System.out.print(i + " ");

    }

    public static int[] rearrange(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int x = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = x;
        }
        return nums;
    }


    
}