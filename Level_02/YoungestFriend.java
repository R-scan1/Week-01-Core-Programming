import java.util.Scanner;
public class YoungestFriend{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input from the user
		  System.out.println("Enter the age of Amar ");		
		  int age1=input.nextInt();
		  System.out.println("Enter the age of Akbar ");		
		  int age2=input.nextInt();
		  System.out.println("Enter the age of Anthony ");		
		  int age3=input.nextInt();
		  
		  System.out.println("Enter the height of Amar ");		
		  double height1=input.nextDouble();
		  System.out.println("Enter the height of Akbar ");		
		  double height2=input.nextDouble();
		  System.out.println("Enter the height of Anthony ");		
		  double height3=input.nextDouble();
          
		String youngestName;
        int youngestAge;

        if (age1 < age2 && age1< age3) {
            youngestName = "Amar";
            youngestAge = age1;
        } else if (age2 < age1 && age2 < age3) {
            youngestName = "Akbar";
            youngestAge = age2;
        } else {
            youngestName = "Anthony";
            youngestAge = age3;
        }

        // Determine the tallest friend
        String tallestName;
        double tallestHeight;

        if (height1 > height2 && height1 > height3) {
            tallestName = "Amar";
            tallestHeight = height1;
        } else if (height2 > height1 && height2 > height3) {
            tallestName = "Akbar";
            tallestHeight = height2;
        } else {
            tallestName = "Anthony";
            tallestHeight = height3;
        }

        // Display the results
        System.out.println("The youngest friend is " + youngestName + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallestName + " with height " + tallestHeight + " cm.");


	  
		  input.close();
	  }  
}