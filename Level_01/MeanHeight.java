import  java.util.Scanner;

public class MeanHeight{
   public static void main(String [] args){
	   
	   Scanner input=new Scanner(System.in);
	   
	   int n=11;
	   
	   //creating array
	   double height[] =new double[n];
	   
	   double total=0.0;

	   for(int i=0;i<height.length;i++){
		   System.out.println("Enter Your Height: ");
		   height[i]=input.nextDouble();
		   total+=height[i];
	   }
	   
	   double meanHeight=total/11;
	   
	   System.out.println("Mean Height of players in present football team is :%.2f",meanHeight);
	 
	   
	   input.close();
   }
}