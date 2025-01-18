import java.util.Scanner;
public class CompareLexicographically {
   
	
	public static String[] compareLexicographically(String string1, String string2) {
		String [] result = {string1,string2};
		int n=0;
		if(string1.length()<string2.length()){
			n=string1.length();
		}else{
			n=string2.length();
		}
		for(int i=0;i<n;i++)
		{
			
	
			if(string1.charAt(i)>string2.charAt(i))
			{
				result[0]=string2;
				result[1]=string1;
				break;
			}
			else if(string2.length()==i+1 && string1.length()>i)
			{
				result[0]=string2;
				result[1]=string1;
				break;
			}
        		
    
		}
		return result;
	}
  
	 public static void main(String[] args) {
		
	    Scanner input= new Scanner(System.in);
        System.out.println("Enter First String :");
        String firstString = input.next();
		
		
		 System.out.println("Enter Second String :");
        String secondString= input.next();
		
		String[] answer= compareLexicographically(firstString,secondString);
		
		System.out.println(answer[0]+" comes before "+answer[1]+ " in lexicographical order.");
		input.close();
	 }
}