import java.util.Scanner;
public class Calculator{
       public static void main(String [] args){
		   
		//creating Scanner object
		  Scanner input=new Scanner(System.in);
		  
		//taking input 
          float number1=input.nextFloat();
          float number2=input.nextFloat();

        //performing operations
          float add=number1+number2;
          float substract=number1-number2;
          float multiply=number1*number2;
          float divide=number1/number2;
        
	  //displaying the result
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+add+", "+substract+", "+multiply+", and "+divide);		  
	   }
}