import java.util.Scanner;
public class RemoveCharacter {
   
	
	public static String removeCharacter(String text,char character) {
			 String result="";
			 for(int i=0;i<text.length();i++){
				 if(text.charAt(i)!=character){
					 result+=text.charAt(i);
				 }
			 }
			 return result;
    }
	
	
	
    
	 public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
		
        System.out.println("Enter string :");
        String text = input.next();
		System.out.println("Enter the character to remove :");
		char character=input.next().charAt(0);
		
        String result = removeCharacter(text,character);
        System.out.println("Result after removing the character "+character+" from string :"+text+" is "+result);
    }

   
}