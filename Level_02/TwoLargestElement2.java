import java.util.Scanner;

public class TwoLargestElement2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        while (number <= 0) {
            System.out.print("Invalid input. Please enter a positive number: ");
            number = input.nextInt();
        }

        //declaring and initializing thee variaables
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temporary = new int[maxDigit];

                for (int i = 0; i < digits.length; i++) {
                    temporary[i] = digits[i];
                }
                digits = temporary;
            }

            digits[index] = number % 10; 
            number /= 10;                
            index++;
        }
        int largest = -1, secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];     
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; 
            }
        }

        //displaying the results
        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }
    }
}