public class UnitConverter3 {
   
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9; 
    }

   
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

   
    public static double poundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

   
    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

   
    public static double gallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

   
    public static double litersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
       
        double fahrenheit = 98.6;
        double celsius = 37;
        double pounds = 150;
        double kilograms = 68;
        double gallons = 5;
        double liters = 10;

        System.out.println(fahrenheit + "°F is equal to " + fahrenheitToCelsius(fahrenheit) + "°C.");
        System.out.println(celsius + "°C is equal to " + celsiusToFahrenheit(celsius) + "°F.");
        System.out.println(pounds + " pounds is equal to " + poundsToKilograms(pounds) + " kilograms.");
        System.out.println(kilograms + " kilograms is equal to " + kilogramsToPounds(kilograms) + " pounds.");
        System.out.println(gallons + " gallons is equal to " + gallonsToLiters(gallons) + " liters.");
        System.out.println(liters + " liters is equal to " + litersToGallons(liters) + " gallons.");
    }
}

