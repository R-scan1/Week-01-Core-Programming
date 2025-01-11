import java.util.Scanner;
public class SideOfSquare{
       public static void main(String [] args){
		   
		//creating Scanner object
		  Scanner input=new Scanner(System.in);
		  
		//taking input 
          double perimeter=input.nextDouble();
          

        //calculating side of square
          double side=perimeter/4;
        
	    //displaying the result
          System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
         
          input.close();		 
	   }
}