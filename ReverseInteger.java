public class ReverseInteger {
    public static void main(String[] args) {
        int number = 1463847412; // Example input
        int reversedNumber = reverseInteger(number);

        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static int reverseInteger(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            number /= 10;

            // Check for overflow before multiplying by 10
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow occurred
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Overflow occurred
            }

            reversed = reversed * 10 + digit;
        }

        return reversed;
    }
}
