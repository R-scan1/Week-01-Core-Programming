import java.util.Scanner;
public class CountDown{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input 
          System.out.println("Enter the number from where to begin the countdown:")	;	
		  int counter=input.nextInt();

	    //loop to display countdown
		  while(counter>0){
		     System.out.println(counter--);	  
		  }
	       
		  input.close();
	  }  
}