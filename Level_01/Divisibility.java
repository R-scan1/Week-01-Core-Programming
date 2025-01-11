import java.util.Scanner;
public class Divisibility{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input  
		  int number=input.nextInt();
		  
		  String answer;
		  
		  
		//checking condition
		  if(number%5==0){
		     answer="Yes";
		  }
		  else{
		     answer="No";
		  }
		 
		  
		  
		//displaying the result
          System.out.println("Is the number "+number+" divisible by 5? "+answer);		
		  
		  input.close();
	  }  
}