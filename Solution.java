public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;





     if(n==1 && digits[0]==0){
        return new int[]{1};
     }

     
     if(n==1 && digits[0]==1){
        return new int[]{2};
     }




        // Start from the last digit and move to the first
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, just add 1 and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // Otherwise, set the current digit to 0
            digits[i] = 0;
        }

        // If all the digits were 9, we need to create a new array
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] digits = {8,9,9,9};
        int[] result = sol.plusOne(digits);

        // Print the result
        for (int digit : result) {
            System.out.print(digit + " ");
        }
        // Output will be: 1 2 4
    }
}
