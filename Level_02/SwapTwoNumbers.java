import java.util.Scanner;
public class SwapTwoNumbers{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input  
		  int number1=input.nextInt();
		  int number2=input.nextInt();
		  
		  
		//swapping
		  number1=number1+number2;
		  number2=number1-number2;
		  number1=number1-number2;
		  
		  
		//displaying the result
          System.out.println("The swapped numbers are "+number1+" and "+number2);		
		  
		  input.close();
	  }  
}