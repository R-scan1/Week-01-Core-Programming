import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		//taking input from user 
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        //declaring 2D array
        int[][] matrix = new int[rows][columns];
        
		
		//initializing 2D array
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int[] array = new int[rows * columns];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }
        
		//displaying the result
        System.out.print("The 1D array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        input.close();
    }
}