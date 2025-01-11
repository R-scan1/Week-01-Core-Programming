import java.util.Scanner;
public class TotalPrice{
       public static void main(String [] args){
		   
		//creating Scanner object
		  Scanner input=new Scanner(System.in);
		  
		//taking input 
          int unitPrice=input.nextInt();
		  int quantity=input.nextInt();
          

        //calculating price 
          int purchasePrice=unitPrice*quantity;
		  

	    //displaying the result
          System.out.println("The total purchase price is INR "+purchasePrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
         
          input.close();		 
	   }
}