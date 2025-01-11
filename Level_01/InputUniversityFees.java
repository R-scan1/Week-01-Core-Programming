import java.util.Scanner;
public class InputUniversityFees{
       public static void main(String [] args){
		  
         //		  
		   Scanner input=new Scanner(System.in);
		   
		 //declaring and initializing fee and discount percentage  
		   double fee=input.nextDouble();
		   double discountPercentage=input.nextDouble();
		   
		 //calculating discount in INR  
		   double discount=(fee/100)*discountPercentage;
		   
		 //calculating fees after giving discount  
		   double feeAfterDiscount=fee-discount;
		   
		 //displaying the discount amount and discounted fees  
		   System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+feeAfterDiscount);
	   }
}