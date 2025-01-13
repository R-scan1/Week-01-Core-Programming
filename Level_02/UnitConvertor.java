public class UnitConvertor {
   
    public static double yardsToFeet(double yards) {
        return yards * 3;
    }

   
    public static double feetToYards(double feet) {
        return feet / 3;
    }

   
    public static double metersToInches(double meters) {
        return meters * 39.3701;
    }

   
    public static double inchesToMeters(double inches) {
        return inches * 0.0254;
    }

   
    public static double inchesToCentimeters(double inches) {
        return inches * 2.54; 
    }

    public static void main(String[] args) {
       
        double yards = 3;
        double feet = 0.333333;
        double meters = 1;
        double inches = 10;

        System.out.println(yards + " yards is equal to " + yardsToFeet(yards) + " feet.");
        System.out.println(feet + " feet is equal to " + feetToYards(feet) + " yards.");
        System.out.println(meters + " meter is equal to " + metersToInches(meters) + " inches.");
        System.out.println(inches + " inches is equal to " + inchesToMeters(inches) + " meters.");
        System.out.println(inches + " inches is equal to " + inchesToCentimeters(inches) + " centimeters.");
    }
}