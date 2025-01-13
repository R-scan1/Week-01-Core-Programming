import java.util.Scanner;

public class WindChill {
    //calculating wind chill
    public static double calculateWindChill(double temperature, double windSpeed) {
       
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking input from the user
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = input.nextDouble();

    
        double windChill = calculateWindChill(temperature, windSpeed);

        //displaying the result
        System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);
        input.close();
    }

}
