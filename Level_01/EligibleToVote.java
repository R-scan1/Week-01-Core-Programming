import  java.util.Scanner;

public class EligibleToVote{
   public static void main(String [] args){
	   
	   Scanner input=new Scanner(System.in);
	   
	   int n=10;
	   
	   //creating array
	   int [] age=new int[n];
	   
	   
	   //taking input and displaying result using for loop
	   for(int i=0;i<age.length;i++){
		   System.out.println("Enter your age :");
		   age[i]=input.nextInt();
		   if(age[i]>0){
			   if(age[i]>=18){
				   System.out.println("The student with the age "+age[i]+" can vote.");
			   }
			   else{
				   System.out.println("The student with the age "+age[i]+" cannot vote.");
			   }
		   }
		   else{
			   System.out.println("Invalid Age");
		   }
	   }
	   
	   input.close();
   }
}