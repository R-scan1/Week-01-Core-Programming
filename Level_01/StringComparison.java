import java.util.Scanner;
public class StringComparison{
	
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
	
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("Enter String 1");
		String string1=input.next();
		
	    System.out.println("Enter String 2");
		String string2=input.next();
		
		
		System.out.println("String comparison result using charAt():"+stringComparison(string1,string2));
		System.out.println("String comparison result using equals():"+string1.equals(string2));
		
		input.close();
	}
}