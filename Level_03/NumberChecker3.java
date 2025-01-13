import java.util.Arrays;
public class NumberChecker3 {
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] storeDigits(int number) {
        int numDigits = countDigits(number);
        int[] digits = new int[numDigits];
        for (int i = numDigits - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 121;

        int count = countDigits(number);
        System.out.println("Count of digits in " + number + ": " + count);

        int[] digits = storeDigits(number);
        System.out.println("Digits of " + number + ": " + Arrays.toString(digits));

        int[] reversedDigits = reverseArray(digits);
        System.out.println("Reversed digits of " + number + ": " + Arrays.toString(reversedDigits));

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        if (isDuckNumber(number)) {
            System.out.println(number + " is a duck number.");
        } else {
            System.out.println(number + " is not a duck number.");
        }
    }
}

