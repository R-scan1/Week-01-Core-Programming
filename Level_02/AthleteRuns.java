import java.util.Scanner;
public class AthleteRuns{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input  
		  int side1=input.nextInt();
		  int side2=input.nextInt();
		  int side3=input.nextInt();
		  
		  
		//calculating perimeter and distance
		  int perimeter=side1+side2+side3;
		  int rounds=5000/perimeter;
		 
		  
		  
		//displaying the result
          System.out.println("The total number of rounds the athlete will run is "+rounds+" to complete 5 km");		
		  
		  input.close();
	  }  
}