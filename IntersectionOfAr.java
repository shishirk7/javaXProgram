import java.util.Arrays;

public class IntersectionOfAr {
    public static int[] intersect(int[] nums1, int[] nums2) {
        // Sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        int k = 0;
        
        // Use a two-pointer technique to find common elements
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                // nums1[i] == nums2[j]
                nums1[k++] = nums1[i];
                i++;
                j++;
            }
        }

        // Return the first k elements of nums1, which are the intersection
        return Arrays.copyOfRange(nums1, 0, k);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = intersect(nums1, nums2);
        System.out.println(Arrays.toString(result)); // Output: [2, 2]

        // Print the result
       // System.out.print("Intersection: ");
        //for (int num : result) {
          //  System.out.print(num + " ");
        //}
        // Output: Intersection: 2 2 
    }
}
