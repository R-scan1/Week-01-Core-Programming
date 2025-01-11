import java.util.Scanner;
public class ChocolateDistribution{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input  
		  int numberOfChocolates=input.nextInt();
		  int numberOfChildren=input.nextInt();
		  
		  
		  
		//calculating 
		  int chocoPerChild=numberOfChocolates/numberOfChildren;
		  int remainingChocolates=numberOfChocolates%numberOfChildren;
		 
		  
		  
		//displaying the result
          System.out.println("The number of chocolates each child gets is "+chocoPerChild+" and the number of remaining chocolates are "+remainingChocolates);		
		  
		  input.close();
	  }  
}