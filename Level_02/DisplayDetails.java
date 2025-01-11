import java.util.Scanner;

public class DisplayDetails {
    public static void main(String[] args) {
        //creating Scanner object
        Scanner sc = new Scanner(System.in);

        //taking the input from user
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter the starting city: ");
        String fromCity = sc.nextLine();
        System.out.print("Enter the via city: ");
        String viaCity = sc.nextLine();
        System.out.print("Enter the destination city: ");
        String toCity = sc.nextLine();

        //Distances in miles
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = sc.nextDouble();
        System.out.print("Enter distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = sc.nextDouble();

        //Time taken in hours
        System.out.print("Enter time taken in hours: ");
        double timeTaken = sc.nextDouble();

        //Calculating total distance and average speed
        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;

        //displaying results
        System.out.println("\nTravel Details:");
        System.out.println("Name: " + name);
        System.out.println("From: " + fromCity);
        System.out.println("Via: " + viaCity);
        System.out.println("To: " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Average Speed: " + averageSpeed + " miles per hour");
        
		sc.close();
	}
}