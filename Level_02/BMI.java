import java.util.Scanner;
public class BMI{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking Input from the user
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in cm: ");
        double heightInCm=sc.nextDouble();

        //Converting  height from cm to meters
        double heightInMeter=heightInCm/100;

        //Calculating BMI
        double bmi=weight/(heightInMeter*heightInMeter);

        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi > 18.4 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25 && bmi < 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        //Displaying results
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);

        sc.close();
    }
}