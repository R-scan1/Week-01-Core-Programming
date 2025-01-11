import java.util.Scanner;
public class InputKMToMiles{
        public static void main(String [] args){
			
	      //creating Scanner object
			Scanner input=new Scanner(System.in);
			
		  //taking input from the user in KM
			double km=input.nextInt();
			
		  //calculating distance in miles
			double inMiles=km/1.6;
			
		  //displaying the result
			System.out.println("The total miles is "+inMiles+" mile for the given "+km+"km");
			
		}
}