import java.util.Scanner;

public class TwoLargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//declaring the variable
        int number, index = 0;
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        
		
		//taking input from user
        System.out.print("Enter a number: ");
        number = input.nextInt(); 

        //iterating until number becomes zero
        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;

            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp;
            }
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

        //displaying the result
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    
	    input.close();
	}
}