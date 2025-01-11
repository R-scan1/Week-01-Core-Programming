import java.util.Scanner;

public class AbundantNumber{
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);

        // taking input from the user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int sum = 0;

        // calculating the divisors and their sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { 
                sum += i;          
            }
        }

        //checking the condition
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }

        input.close();
    }
}