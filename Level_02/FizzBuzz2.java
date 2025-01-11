import java.util.Scanner;

public class FizzBuzz2{

    public static void main(String[] args) {
	  //creating scanner object
        Scanner input = new Scanner(System.in);

      //taking input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
	//calculating conditions	
    if(number>=0){
	  int i=0;
      while(i<=number){
		  if(i%3==0 && i%5==0){
		     System.out.println("FizzBuzz");
		  }
          else if(i%3==0){
             System.out.println("Fizz");		  
		  }	
          else if(i%5==0){
             System.out.println("Buzz");		  
		  }
          else{
			 System.out.println(i); 
		  }
        i++;		  
	  }
	}
	else{
		System.out.println("Invalid Input");
	}
		
		input.close();
	}
}