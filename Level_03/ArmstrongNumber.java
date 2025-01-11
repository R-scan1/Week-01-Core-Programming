import java.util.Scanner;
public class ArmstrongNumber{
	public static void main(String [] args){
	  Scanner input=new Scanner(System.in);
	  
	  //taking input
	  System.out.println("Enter the number: ");
	  int number=input.nextInt();
	  
	  int sum=0,originalNumber=number;
	  
	  //calculating the result
	  while(originalNumber!=0){
		  int reminder=originalNumber%10;
		  originalNumber/=10;
		  sum=sum+(reminder*reminder*reminder);
	  }
	  
	  if(sum==number){
		System.out.println("It is an armstrong number");
	  }
	  else{
		System.out.println("It is not an armstrong number");
	  }
	  
	  input.close();
	}
}