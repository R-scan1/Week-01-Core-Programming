import java.util.Scanner;
public class CountDigits{
	public static void main(String [] args){
	  Scanner input=new Scanner(System.in);
	  
	  //taking input
	  System.out.println("Enter the number: ");
	  int number=input.nextInt();
	  
	  int count=0,originalNumber=number;
	  
	  //calculating the result
	  while(originalNumber!=0){
		  originalNumber/=10;
		  count++;
	  }
	  
	  System.out.println("The number "+number+" have "+count+" digits");
	  
	  input.close();
	}
}