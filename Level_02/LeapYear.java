import java.util.Scanner;
public class LeapYear{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input from the user
		  System.out.println("Enter the year ");		
		  int year=input.nextInt();
          
		//displaying 
        if (year > 1582) {
        
         if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is not a Leap Year.");
                }
            } else {
                System.out.println(year + " is a Leap Year.");
            }
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
			}
			else{
				System.out.println("Invalid year. The year must be >= 1582.");
			}

	  
		  input.close();
	  }  
}