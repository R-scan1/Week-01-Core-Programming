import java.util.Scanner;
public class UserSum2{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		  double total=0.0;
		  double temp=1;
		  
		//loop to check condition and calculate total
          while(true){
			System.out.println("Enter the values: ");
			  temp=input.nextDouble();  //taking input
			  if(temp>0){
			  total=total+temp;
			  }
			  else{
              break;	  
			  }
		  }		
		  
	    //displaying the result
		  System.out.println("Total Value: "+total);
		  
	       
		  input.close();
	  }  
}