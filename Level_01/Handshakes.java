import java.util.Scanner;
public class Handshakes{
       public static void main(String [] args){
		   
		//creating Scanner object
		  Scanner input=new Scanner(System.in);
		  
		//taking input 
          int numberOfStudents=input.nextInt();
		  
          

        //calculating maximum number of handshakes 
          int handshakes=(numberOfStudents*(numberOfStudents-1))/2;
		  

	    //displaying the result
          System.out.println("Number of possible handshakes: "+handshakes);
          input.close();		 
	   }
}