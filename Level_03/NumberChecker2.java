import java.util.Arrays;
public class NumberChecker2 {

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

    
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    
    public static boolean isHarshadNumber(int number) {
        int[] digits = storeDigits(number);
        int sumOfDigits = sumOfDigits(digits);
        return number % sumOfDigits == 0;
    }

    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; 
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; 
            frequency[i][1] = 0; 
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }

    
    public static void displayDigitFrequency(int[][] frequency) {
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + " occurs " + frequency[i][1] + " times.");
            }
        }
    }

    public static void main(String[] args) {

        int number = 21;

      
        int count = countDigits(number);
        System.out.println("Count of digits in " + number + ": " + count);

      
        int[] digits = storeDigits(number);
        System.out.println("Digits of " + number + ": " + Arrays.toString(digits));

      
        int sumDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumDigits);

        
        double sumSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumSquares);

        
        if (isHarshadNumber(number)) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }

   
        int[][] frequency = findDigitFrequency(digits);
        displayDigitFrequency(frequency);
    }
}

