import  java.util.Scanner;

public class MultiplicationTable{
   public static void main(String [] args){
	   
	   Scanner input=new Scanner(System.in);
	   
	   //taking input from the user 
	   System.out.print("Enter the number:");
	   int number=input.nextInt();
	   
	   int n=10;
	   
	   //creating array
	   int table[] =new int[n];
	   

	   for(int i=0;i<table.length;i++){
		   table[i]=number*(i+1);
	   }
	   
	   for(int i=0;i<table.length;i++){
		   System.out.println(number+" * "+(i+1)+" = "+table[i]);
	   }
	 
	   
	   input.close();
   }
}