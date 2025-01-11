import java.util.Scanner;
public class SpringSeason{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input 
          System.out.println("Enter month number:")	;	
		  int month=input.nextInt();
		  
		  System.out.println("Enter day:")	;	
		  int day=input.nextInt();

	
		  
		//checking condition
		  if(month==3&&day>=20){
		     System.out.println("Its a Spring Season");
		  }
		  else if(month==6&&day<=20){
		     System.out.println("Its a Spring Season");
		  }
		  else if(month>3 && month<6){
		     System.out.println("Its a Spring Season");
		  }
		  else{
			  System.out.println("Not a Spring Season");
		  }
		
		  input.close();
	  }  
}