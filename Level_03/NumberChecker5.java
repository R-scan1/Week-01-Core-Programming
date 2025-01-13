public class NumberChecker5 {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int greatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 1];
    }

    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int number) {
        int[] factors = findFactors(number);
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double productOfCubeOfFactors(int number) {
        int[] factors = findFactors(number);
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int number) {
        int sum = sumOfFactors(number) - number; 
        return sum == number;
    }

    public static boolean isAbundantNumber(int number) {
        int sum = sumOfFactors(number) - number;
        return sum > number;
    }

    public static boolean isDeficientNumber(int number) {
        int sum = sumOfFactors(number) - number;
        return sum < number;
    }

    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 145;

        System.out.println("Factors of " + number + ":");
        int[] factors = findFactors(number);
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Greatest factor of " + number + ": " + greatestFactor(number));
        System.out.println("Sum of factors of " + number + ": " + sumOfFactors(number));
        System.out.println("Product of factors of " + number + ": " + productOfFactors(number));
        System.out.println("Product of cube of factors of " + number + ": " + productOfCubeOfFactors(number));

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }

        if (isAbundantNumber(number)) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        if (isDeficientNumber(number)) {
            System.out.println(number + " is a Deficient Number.");
        } else {
            System.out.println(number + " is not a Deficient Number.");
        }

        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong Number.");
        } else {
            System.out.println(number + " is not a Strong Number.");
        }
    }
}

