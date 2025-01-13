import java.util.Scanner;

public class TotalRounds {

    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public static int calculateRounds(double perimeter) {
        
        double totalDistance = 5000;
        return (int) Math.ceil(totalDistance / perimeter); 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking input from the user
        System.out.print("Enter the length of the first side of the triangle (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of the second side of the triangle (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of the third side of the triangle (in meters): ");
        double side3 = input.nextDouble();
		
		  //calculating the perimeter of  triangle
        double perimeter = calculatePerimeter(side1, side2, side3);

        //calculating the number of rounds 
        int rounds = calculateRounds(perimeter);

        //displaying the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");

        input.close();
    }
}


