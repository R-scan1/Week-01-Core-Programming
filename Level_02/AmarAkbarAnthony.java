// importing java util package for scanner
import java.util.Scanner;

public class AmarAkbarAnthony {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//declaring arrays
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
		
		//taking input from user with the help of loops
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }

      
        int youngestIndex = 0, tallestIndex = 0;
        for (int i = 1; i < 3; i++) {  //loop to calculate the youngest and the tallest
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("Youngest Friend: " + names[youngestIndex]);
        System.out.println("Tallest Friend: " + names[tallestIndex]);
		
		input.close();
    }
}
