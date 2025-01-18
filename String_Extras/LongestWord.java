import java.util.Scanner;

public class LongestWord{
		 public static String longestWord(String text){
			String [] temp=text.split(" ");
			String longest=temp[0];
			for(int i=1;i<temp.length;i++){
				   if(temp[i].length()>longest.length()){
					   longest=temp[i];
				   }
				}
				return longest;
			}
			
		 
		 public static void main(String [] args){
	        Scanner input=new Scanner(System.in);
            System.out.println("Enter a sentence:");
            String text=input.nextLine();
            String result=longestWord(text);
            
            System.out.println("Longest Word in String is :"+result);
			
			input.close();
            			  
		 }
}