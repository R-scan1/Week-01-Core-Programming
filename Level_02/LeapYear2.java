import java.util.Scanner;

public class LeapYear2{

    public static void main(String[] args) {
	  //creating scanner object
        Scanner input = new Scanner(System.in);

      //taking input from user
        System.out.print("Enter year: ");
        int year = input.nextInt();
   
      //calculating Leap Year  
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
		
		input.close();
	}
}