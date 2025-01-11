import java.util.Scanner;
public class Income{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input  
		  int salary=input.nextInt();
		  int bonus=input.nextInt();
		  
		  
		//calculating
		  int income=salary+bonus;
		  
		  
		//displaying the result
          System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+income);		
		  
		  input.close();
	  }  
}