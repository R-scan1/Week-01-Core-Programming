import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //taking input from the user
        System.out.print("Enter a number to find its multiplication table from 6 to 9: ");
        int number = input.nextInt();

        int[] multiplicationResult = new int[4];
        
		//storing values in the array
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i; 
        }

        //Display the multiplication table
        System.out.println("Multiplication Table of " + number + " (from 6 to 9):");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        input.close();
    }
}