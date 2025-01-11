import java.util.Scanner;
public class CheckInteger{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input 
          System.out.println("Enter the number:")	;	
		  int number=input.nextInt();

	
		  
		//checking condition
		  if(number>0){
		     System.out.println("Positive");
		  }
		  else if(number<0){
			 System.out.println("Negative");
		  }
		  else{
			 System.out.println("Zero");
		  }
		  
		
		  input.close();
	  }  
}