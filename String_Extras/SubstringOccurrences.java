import java.util.Scanner;
public class SubstringOccurrences {
   
		
		
     public static int countOccurrences(String mainString, String subString) {
        if (mainString == null || subString == null || subString.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
			index=index+subString.length();
        }

        return count;
    }
	
	
	 public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter main string:");
        String mainstring = scanner.next();
		
		
		 System.out.println("Enter Substring string:");
        String substring = scanner.next();
		
		
        
        int count = countOccurrences(mainstring, substring);
        System.out.println("The substring '" + substring + "' occurs " + count + " times in the main string.");
    }

   
}