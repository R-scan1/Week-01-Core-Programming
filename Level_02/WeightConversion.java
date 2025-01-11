import java.util.Scanner;
public class WeightConversion{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input  
		  double weight=input.nextDouble();
		  
		  
		  
		  
		//calculating weight in kilograms as 1 pound=2.2 kilogram
		  double weightInKilograms=weight*2.2;
		  
		 
		  
		  
		//displaying the result
          System.out.println("The weight of the person in pound is "+weight+" and in kg is "+weightInKilograms);		
		  
		  input.close();
	  }  
}