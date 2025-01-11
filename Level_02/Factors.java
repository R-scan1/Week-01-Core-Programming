import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter a number to find its factors: ");
        int number = input.nextInt();

       //calculating factors
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            System.out.println("Factors of " + number + " are:");

            
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) { 
                    System.out.println(i);
                }
            }
        }

        
        input.close();
    }
}