import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking the number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();  // taking input

        
        if (number < 0) {
            number = -number;
        }

        //array to store frequency of digits
        int[] frequency = new int[10];

        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        //displaying frequency of each digit
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
		input.close();
    }
}
