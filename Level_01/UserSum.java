import java.util.Scanner;
public class UserSum{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		  double total=0.0;
		  double temp=1;
		  
		//loop to check condition and calculate total
          while(temp!=0){
			System.out.println("Enter the values: ");
			  temp=input.nextDouble();  //taking input
			  total=total+temp;
		  }		
		  
	    //displaying the result
		  System.out.println("Total Value: "+total);
		  
	       
		  input.close();
	  }  
}