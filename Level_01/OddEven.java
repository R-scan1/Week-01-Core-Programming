import  java.util.Scanner;

public class OddEven{
   public static void main(String [] args){
	   
	   Scanner input=new Scanner(System.in);
	   
	   //taking input from user
	   System.out.println("Enter the number: ");
	   int number=input.nextInt();
	   
	   if(number>0){
	   //creating array
	   int odd[] =new int[number/2+1];
	   int even[] =new int[number/2+1];
	   
	   int oddIndex=0;
	   int evenIndex=0;

	   for(int i=1;i<=number;i++){
		   if(i%2==0){
			   even[evenIndex]=i;
			   evenIndex++;
		   }
		   else{
			   odd[oddIndex]=i;
			   oddIndex++;
		   }
	   }
	   System.out.println("Even integers are following: ");
	   for(int i=0;i<evenIndex;i++){
		   System.out.print(even[i]+" ");
	   }
	   System.out.println("\nOdd integers are following: ");
	   for(int i=0;i<oddIndex;i++){
		   System.out.print(odd[i]+" ");
	   }
	 }
	 else{
		 System.err.println("Invalid Input");
	 }
	   input.close();
   }
}