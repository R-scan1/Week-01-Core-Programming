import java.util.Scanner;
public class CalculateBonus{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input from the user
		  System.out.println("Enter your Salary ");		
		  int salary=input.nextInt();
          System.out.println("Enter your year of service: ");		
		  int year=input.nextInt();
		  
		  int bonus=0;
		  
        if(year>5){	 
           bonus=(salary*5)/100;		
		   System.out.println("Your bonus is "+bonus);
		}
		else{
		   System.out.println("You havn't enough year of service");
		}
	  
		  input.close();
	  }  
}