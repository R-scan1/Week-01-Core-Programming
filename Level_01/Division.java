import java.util.Scanner;

public class Division {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;  
        int remainder = number % divisor;

        
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking input from the user
        System.out.print("Enter the dividend : ");
        int number = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

  
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
        } else {
     
            int[] result = findRemainderAndQuotient(number, divisor);

         //displaying the result
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

        input.close();
    }
}

