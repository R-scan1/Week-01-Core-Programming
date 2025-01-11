import java.util.Scanner;
public class NaturalSum3{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input
        System.out.println("Enter a natural number :");		
		  int number=input.nextInt();
		  
		if(number>0){  
		  
		//calculating sum using formulae
		  int sum1=number*(number+1)/2;
		  
		  
		  int sum2=0;
		//loop to calculate total
          for(int i=1;i<=number;i++){
			sum2+=i;
			
		  }		
		  
	    //displaying the result
		  System.out.println("Result Using Formulae :"+sum1+"\nResult Using For Loop :"+sum2);
		}
		else{
			System.out.println("Not a natural number.");
		}
	       
		  input.close();
	  }  
}