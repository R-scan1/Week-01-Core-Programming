import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //taking input from user
        System.out.print("Enter a number to find its greatest factor (beside itself): ");
        int number = scanner.nextInt();

        
        int greatestFactor = 1;
        
		//calculating the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { 
                greatestFactor = i; 
                break; 
            }
        }

        // Displaying the result
        System.out.println("The greatest factor of " + number + " (beside itself) is: " + greatestFactor);

       
        scanner.close();
    }
}