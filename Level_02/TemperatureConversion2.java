import java.util.Scanner;
public class TemperatureConversion2{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input  
		  double fahrenheit=input.nextDouble();
		  
		  
		//calculating
		  double celsiusResult=(fahrenheit-32)*(double)5/9;
		  
		  
		//displaying the result
          System.out.println("The "+fahrenheit+" fahrenheit is "+celsiusResult+ " Celsius.");		
		  
		  input.close();
	  }  
}