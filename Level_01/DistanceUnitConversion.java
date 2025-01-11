import java.util.Scanner;
public class DistanceUnitConversion{
       public static void main(String [] args){
		   
		//creating Scanner object
		  Scanner input=new Scanner(System.in);
		  
		//taking input 
          double distanceInFeet=input.nextDouble();
          

        //calculating distance in yard
          double distanceInYard=distanceInFeet/3;
		  
		//calculating distance in yard
		  double distanceInMile=distanceInYard/1760;
        
	    //displaying the result
          System.out.println("Distance in Feet is "+distanceInFeet+" while in yard is "+distanceInYard+" and mile is "+distanceInMile);
         
          input.close();		 
	   }
}