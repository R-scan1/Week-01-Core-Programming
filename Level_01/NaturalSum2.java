import java.util.Scanner;
public class NaturalSum2{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input
        System.out.println("Enter a natural number :");		
		  int number=input.nextInt();
		  
		//calculating sum using formulae
		  int sum1=number*(number+1)/2;
		  
		  
		  int sum2=0;
		//loop to calculate sum
          while(number>0){
			sum2+=number;
			number--;
		  }		
		  
	    //displaying the result
		  System.out.println("Result Using Formulae :"+sum1+"\nResult Using While Loop :"+sum2);
		  
	       
		  input.close();
	  }  
}