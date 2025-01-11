import java.util.Scanner;

public class BMICalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfPersons; 
		
		//taking input from the user
        System.out.print("Enter number of persons: ");
        numberOfPersons = input.nextInt();

        double[][] personData = new double[numberOfPersons][3]; 
        String[] weightStatus = new String[numberOfPersons];


        //taking input from user using for loop
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
            double height = input.nextDouble();

            while (height <= 0) {
                System.out.print("Invalid height. Enter a positive value: ");
                height = input.nextDouble();
            }

            System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
            double weight = input.nextDouble();

            while (weight <= 0) {
                System.out.print("Invalid weight. Enter a positive value: ");
                weight = input.nextDouble();
            }

            double bmi = weight / (height * height);
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;
          
		  //determining categories as per the conditions
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + " - Height: " + personData[i][0] + ", Weight: " + personData[i][1] +
                    ", BMI: " + personData[i][2] + ", Status: " + weightStatus[i]);
        }
    }
}
