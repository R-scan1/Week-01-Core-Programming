public class ProfitLoss{
     public static void main(String [] args){
		 
	   //declaring and initializing the cost price and selling price	 
		 double costPrice=129;
		 double sellingPrice=191;
		 
	   //calculating profit	 
		 double profit=sellingPrice-costPrice;
		 
	   //calculating profit percentage	 
		 double profitPercentage=(profit/costPrice)*100;
		 
	   //displaying all the results	 
		 System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice+"\nThe Profit is INR "+profit+" and the Profit Percentage is "+profitPercentage);
	 }
}