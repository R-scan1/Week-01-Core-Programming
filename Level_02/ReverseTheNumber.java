import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
		 
        Scanner input = new Scanner(System.in);
		
		// declaring the variable number
        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();
		
		int temp=number;

        int count=0;
		while(temp!=0){
			temp/=10;
			count++;
		}
		
		 int[] digits = new int[count];

        for (int i = 0; i <count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        //displaying the the result
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

    }
}
