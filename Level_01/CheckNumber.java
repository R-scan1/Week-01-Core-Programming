import  java.util.Scanner;

public class CheckNumber{
   public static void main(String [] args){
	   
	   Scanner input=new Scanner(System.in);
	   
	   int n=5;
	   
	   //creating array
	   int [] numbers=new int[n];
	   
	   
	   //taking input 
	   System.out.println("Enter five numbers :");
	   for(int i=0;i<numbers.length;i++){
		   numbers[i]=input.nextInt();
		   if(numbers[i]>0){
			   if(numbers[i]%2==0){
				   System.out.println("The number "+numbers[i]+" is Even");
			   }
			   else{
				   System.out.println("The number "+numbers[i]+" is Odd.");
			   }
		   }
		   else if(numbers[i]==0){
			   System.out.println("Number is Zero");
		   }
		   else{
			   System.out.println("Number is Negative");
		   }
	   }
	   
	   //checking if the numbe
   if(numbers[0]>numbers[numbers.length-1]){
		      System.out.println("First element is greater than last Elements.");
	   }
   else if(numbers[0]<numbers[numbers.length-1]){
	          System.out.println("First element is less than last Element.");
	   }
	else {
	          System.out.println("First and Last Elements are equal.");
	   }   
	   
	   input.close();
   }
}