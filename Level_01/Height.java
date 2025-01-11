import java.util.Scanner;
public class Height{
       public static void main(String [] args){
		  
         //creating Scanner object	  
		   Scanner input=new Scanner(System.in);
		 
         //taking input of height in cm
           double height=input.nextDouble();

         //calculating height in inches 
           double heightInInches=height/2.54;

         //calculating height in feet
           double heightInFeet=heightInInches/12;	

         //displaying the result
           System.out.println("Your Height in cm is "+height+" while in feet is "+heightInFeet+" and inches is "+heightInInches);		 
		 
	   }
}