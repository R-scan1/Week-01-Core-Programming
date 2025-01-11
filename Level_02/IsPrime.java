import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
	  //taking input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean isPrime = true;

        // number less than or equal to 1 is not prime
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
		
      //displaying the result using conditional statements
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        input.close();
    }
}