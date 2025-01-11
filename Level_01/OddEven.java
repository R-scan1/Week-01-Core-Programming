import java.util.Scanner;
public class OddEven{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input from the user
          System.out.println("Enter the number:");		
		  int number=input.nextInt();
		  
        if(number>0){	  
		//loop to calculate and print odd even
		   for(int i=1;i<=number;i++)  {
		      if(i%2==0){  
		          System.out.println("The number "+i+" is even.");
		      }
              else{
                  System.out.println("The number "+i+" is odd.");
              } 
            		  
		}
		}
		else{
			System.out.println("Number is not natural.");
		}
	  
		  input.close();
	  }  
}