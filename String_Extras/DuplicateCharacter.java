import java.util.Scanner;

public class DuplicateCharacter{
		 public static String removeDuplicate(String text){
			String result="";
			result+=text.charAt(0);
			for(int i=0;i<text.length();i++){
				int empty=0;
				for(int  j=0;j<result.length();j++){
					if(text.charAt(i)==result.charAt(j)){
						empty=1;
						break;
					}
				}
				if(empty==0){
					result+=text.charAt(i);
				}
			}
			return result;
		 }
		 public static void main(String [] args){
	        Scanner input=new Scanner(System.in);
            System.out.println("Enter a string:");
            String text=input.next();
            String result=removeDuplicate(text);
            
            System.out.println("String without duplicates :"+result);
            			
		 }
}
