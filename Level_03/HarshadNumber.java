import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //taking input from user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Calculating the sum of the digits
        while (number > 0) {
            int digit = number % 10; 
            sum += digit;           
            number /= 10;           
        }

        //checking the condition
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is Not a Harshad Number.");
        }

        scanner.close();
    }
}