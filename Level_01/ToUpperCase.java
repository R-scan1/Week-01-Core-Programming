import java.util.Scanner;

public class ToUpperCase {

    public static String toUpperCase(String text) {
		String result="";
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)<'a'){
				result+=text.charAt(i);
			}
			else if(text.charAt(i)>='a'){
				result+=(char)(text.charAt(i)-32);
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
        
		String upperCaseUsingCharAt=toUpperCase(text);
		String upperCaseUsingToUpperCase=text.toUpperCase();
        boolean areEqual = stringComparison(upperCaseUsingCharAt,upperCaseUsingToUpperCase);
		
		System.out.println("Changing to uppercase  using User Defined method :"+upperCaseUsingCharAt);
	    System.out.println("Changing to uppercase  using Built In method toUpperCase() :"+upperCaseUsingToUpperCase);
	    System.out.println("Comparing result from both the methods if the string are equal:"+areEqual);

 
		input.close();
    }
}