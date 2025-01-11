public class UniversityFees{
       public static void main(String [] args){
		   
		 //declaring and initializing fee and discount percentage  
		   double fee=125000;
		   double discountPercentage=10;
		   
		 //calculating discount in INR  
		   double discount=(125000/100)*10;
		   
		 //calculating fees after giving discount  
		   double feeAfterDiscount=fee-discount;
		   
		 //displaying the discount amount and discounted fees  
		   System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+feeAfterDiscount);
	   }
}