import java.util.Scanner;

public class PowerOfNumber{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
	   //taking input from the user
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        int result = 1;

        //calculating the power using loop
        for (int i = 1; i <= power; i++) {
            result *= number;  // Multiply result by number in each iteration
        }

        // Displaying the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        scanner.close();
    }
}