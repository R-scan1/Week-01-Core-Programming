import java.util.Scanner;
public class SimpleInterest{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input  
		  double principle=input.nextDouble();
		  double rate=input.nextDouble();
		  double time=input.nextDouble();
		  
		  
		  
		//calculating simple interest
		  double simpleInterest=(principle*rate*time)/100;
		  
		 
		  
		  
		//displaying the result
          System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principle+", Rate of Interest "+rate+" and Time "+time);		
		  
		  input.close();
	  }  
}