import java.util.Scanner;
public class NaturalSum{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input  
		  int number=input.nextInt();

	
		  
		//checking condition
		  if(number>0){
			 int sum=number*(number+1)/2;
		     System.out.println("The sum of "+number+" natural numbers is "+sum);
		  }
		  else{
			 System.out.println("The number "+number+" is not a natural number");
		  }
		  
		
		  input.close();
	  }  
}