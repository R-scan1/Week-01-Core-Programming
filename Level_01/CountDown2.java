import java.util.Scanner;
public class CountDown2{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input 
          System.out.println("Enter the number from where to begin the countdown:")	;	
		  int counter=input.nextInt();

	    //loop to display countdown
		  for(int i=counter;i>0;i--){
		     System.out.println(i);
		  }
	       
		  input.close();
	  }  
}