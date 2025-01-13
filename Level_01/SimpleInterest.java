
import java.util.Scanner;

public class SimpleInterest {

    public static double calculateSimpleInterest(double principle, double rate, double time) {
        return (principle * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking input from the user 
        System.out.print("Enter the principle amount: ");
        double principle = input.nextDouble();

        System.out.print("Enter the Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = input.nextDouble();

        //calculating simple interest 
        double simpleInterest = calculateSimpleInterest(principle, rate, time);

        //displaying the result
        System.out.printf("The Simple Interest is %.2f for principle %.2f, Rate of Interest %.2f, and Time %.2f years.%n",
                simpleInterest, principle, rate, time);

        input.close();
    }
}
