import java.util.Scanner;
public class Factorial2{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input from the user
          System.out.println("Enter the number:");		
		  int number=input.nextInt();
		  
		int factorial=1,temp=number; 
		  
		if(number>=0){  
		//loop to calculate factorial using for loop
          for(int i=temp;i>0;i--){
			factorial*=i;
			
		  }		
		  
	    //displaying the result
		  System.out.println("Factorial of "+number+" would be "+factorial);
		  
		}
		else{
		  System.out.println("Number is negative.");
		}
		  
	       
		  input.close();
	  }  
}