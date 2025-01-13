import java.util.Scanner;

public class Trigonometry {
    
    //calculating trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
      
        double radians = Math.toRadians(angle);

        //calculating sine, cosine, and tangent 
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);


        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       //taking input from the user
        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();

      
        double[] trigFunctions = calculateTrigonometricFunctions(angle);

        //displaying the result
        System.out.printf("Sine of %.2f degrees: %.4f\n", angle, trigFunctions[0]);
         System.out.printf("Cosine of %.2f degrees: %.4f\n", angle, trigFunctions[1]);
        System.out.printf("Tangent of %.2f degrees: %.4f\n", angle, trigFunctions[2]);

        input.close();
    }
}