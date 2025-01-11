import java.util.Scanner;
public class MultiplicationTable{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input from the user
		  System.out.println("Enter the number ");		
		  int number=input.nextInt();
          
		//displaying the table using for loop
        for(int i=6;i<=9;i++){
			System.out.println(number+"*"+i+" = "+(number*i));
		}
	  
		  input.close();
	  }  
}