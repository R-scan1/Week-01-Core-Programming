import java.util.Scanner;
public class ToggleCase {
   
	
	public static String toggleCase(String text) {
			 String result="";
			 for(int i=0;i<text.length();i++){
				if(text.charAt(i)<='Z'){
					result+=(char)(text.charAt(i)+32);
				}
                else if(text.charAt(i)>='a'){
					result+=(char)(text.charAt(i)-32);
				}				
			 }
			 return result;
    }
	
	
	
    
	 public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
		
        System.out.println("Enter string :");
        String text = scanner.next();
		
        String result = toggleCase(text);
        System.out.println("Result after toggle case " +result);
		
    }

   
}