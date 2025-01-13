public class SpringSeason {
    public static boolean isSpringSeason(int month, int day) {
        
        if (month > 3 && month < 6) {
            return true; 
        } else if (month == 3 && day >= 20) {
            return true;
        } else if (month == 6 && day <= 20) {
            return true; 
        }
        return false; 
    }

    public static void main(String[] args) {
       //checking if proper input is given
        if (args.length != 2) {
            System.out.println("Please provide two arguments: month and day.");
            return;
        }
        
		//accessing input from command line argument
        int month = Integer.parseInt(args[0]);  
        int day = Integer.parseInt(args[1]);   

       //displaying the result using conditional statement
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}

