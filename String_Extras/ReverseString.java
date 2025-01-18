import java.util.Scanner;

public class ReverseString{
		 public static String reverseString(String text){
			String result="";
			for(int i=text.length()-1;i>=0;i--){
				   result+=text.charAt(i);
				}
				return result;
			}
			
		 
		 public static void main(String [] args){
	        Scanner input=new Scanner(System.in);
            System.out.println("Enter a string:");
            String text=input.next();
            String result=reverseString(text);
            
            System.out.println("Original String :"+text+"\nReversed String :"+result);
			
			input.close();
            			  
		 }
}
