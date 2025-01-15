import java.util.Scanner;

public class ToLowerCase {

    public static String toLowerCase(String text) {
		String result="";
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)>='a'){
				result+=text.charAt(i);
			}
			else if(text.charAt(i)<='Z'){
				result+=(char)(text.charAt(i)+32);
			}
        }
        return result;
    }

    public  static boolean stringComparison(String s1, String s2){
		if (s1.length()== s2.length()){
			for(int i=0; i<s1.length();i++){
				if (s1.charAt(i)!=s2.charAt(i)){
					return false;
				}
				else{
					return true;
				}
			}
			
		}	
		return false;
				
	}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        
		String lowerCaseUsingCharAt=toLowerCase(text);
		String lowerCaseUsingToLowerCase=text.toLowerCase();
        boolean areEqual = stringComparison(lowerCaseUsingCharAt,lowerCaseUsingToLowerCase);
		
		System.out.println("Changing to lowercase  using User Defined method :"+lowerCaseUsingCharAt);
	    System.out.println("Changing to lowercase  using Built In method toLowerCase() :"+lowerCaseUsingToLowerCase);
	    System.out.println("Comparing result from both the methods if the string are equal:"+areEqual);

 
		input.close();
    }
}