import java.util.Scanner;
public class Largest{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input  
		  int number1=input.nextInt();
		  int number2=input.nextInt();
		  int number3=input.nextInt();
		  
		  String answer1="No",answer2="No",answer3="No";
		  
		  
		//checking condition
		  if(number1>number2 && number1>number3){
		     answer1="Yes";
		  }
		  else if(number2>number1 && number2>number3){
		     answer2="Yes";
		  }
		  else if(number3>number1 && number3>number2){
		     answer3="Yes";
		  }
		 
		  
		  
		//displaying the result
          System.out.println("Is the first number the largest? "+answer1+"\nIs the second number the largest? "+answer2+"\nIs the third number the largest? "+answer3);		
		  
		  input.close();
	  }  
}