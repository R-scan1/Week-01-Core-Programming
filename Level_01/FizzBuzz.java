import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		
		//taking input from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
		//declaring the string array
        String[] fizzBuzzArray = new String[number + 1];

        //initializing the string array using conditional statement 
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzArray[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                fizzBuzzArray[i] = "Fizz";
            } else if (i % 5 == 0) {
                fizzBuzzArray[i] = "Buzz";
            } else {
                fizzBuzzArray[i] = i + ""; 
            }
        }

        //displaying result using for loop
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + fizzBuzzArray[i]);
        }

        input.close();
    }
}