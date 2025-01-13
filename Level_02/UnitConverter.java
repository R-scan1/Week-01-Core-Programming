public class UnitConverter {

   
    public static double convertKmToMiles(double kilometers) {
        double kmToMilesFactor = 0.621371;
        return kilometers * kmToMilesFactor;
    }

   
    public static double convertMilesToKm(double miles) {
        double milesToKmFactor = 1.60934;
        return miles * milesToKmFactor;
    }

   
    public static double convertMetersToFeet(double meters) {
        double metersToFeetFactor = 3.28084;
        return meters * metersToFeetFactor;
    }

   
    public static double convertFeetToMeters(double feet) {
        double feetToMetersFactor = 0.3048;
        return feet * feetToMetersFactor;
    }

    public static void main(String[] args) {
       
        double kilometers = 5.0;
        double miles = 3.1;
        double meters = 100.0;
        double feet = 328.084;

       
        System.out.println(kilometers + " kilometers equals " + convertKmToMiles(kilometers) + " miles.");
        System.out.println(miles + " miles equals " + convertMilesToKm(miles) + " kilometers.");
        System.out.println(meters + " meters equals " + convertMetersToFeet(meters) + " feet.");
        System.out.println(feet + " feet equals " + convertFeetToMeters(feet) + " meters.");
    }
}

