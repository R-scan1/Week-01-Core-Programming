public class NumberChecker4 {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; 
       }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true;
    }

    
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;

        while (square > 0) {
         sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number; // Neon number condition
    }

       public static boolean isSpyNumber(int number) {
        int sum = 0, product = 1;
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        int length = String.valueOf(number).length();
        int lastDigits = square % (int) Math.pow(10, length);
        return lastDigits == number;
    }

    public static boolean isBuzzNumber(int number) {
        return (number % 7 == 0 || number % 10 == 7);
    }

    public static void main(String[] args) {
        int number = 25; // Example number

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        if (isNeonNumber(number)) {
            System.out.println(number + " is a neon number.");
        } else {
            System.out.println(number + " is not a neon number.");
        }

        if (isSpyNumber(number)) {
            System.out.println(number + " is a spy number.");
        } else {
            System.out.println(number + " is not a spy number.");
        }

        if (isAutomorphicNumber(number)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }

        if (isBuzzNumber(number)) {
            System.out.println(number + " is a buzz number.");
        } else {
            System.out.println(number + " is not a buzz number.");
        }
    }
}

