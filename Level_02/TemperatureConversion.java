import java.util.Scanner;
public class TemperatureConversion{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input  
		  double celsius=input.nextDouble();
		  
		  
		//calculating
		  double farenheitResult=(celsius*(double)9/5)+32;
		  
		  
		//displaying the result
          System.out.println("The "+celsius+" celsius is "+farenheitResult+ " fahrenheit");		
		  
		  input.close();
	  }  
}