import java.util.Scanner;

public class CheckPalindromeString{
		 public static boolean isPalindrome(String text){
			String reversed="";
			for(int i=text.length()-1;i>=0;i--){
				   reversed+=text.charAt(i);
				}
				return reversed.equals(text);
			}
			
		 
		 public static void main(String [] args){
	        Scanner input=new Scanner(System.in);
            System.out.println("Enter a string:");
            String text=input.next();
            boolean result=isPalindrome(text);
            
            System.out.println("Is the string "+text+" palindrome :"+result);
			
			input.close();
            			  
		 }
}