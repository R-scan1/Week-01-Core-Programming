import java.util.*;
import java.lang.*;
public class Anagram{
   
	
	public static boolean isAnagram(String string1, String string2) {
		char [] str1=string1.toCharArray();
		char [] str2=string2.toCharArray();
		if(string1.length()!=string2.length()){
			return false;
		}
		else{
		    Arrays.sort(str1);
			Arrays.sort(str2);
			
			String res1=String.valueOf(str1);
			String res2=String.valueOf(str2);
			return res1.equals(res2);
			
		}
	}
	
	
  
	 public static void main(String[] args) {
		
	    Scanner input= new Scanner(System.in);
        System.out.println("Enter First String :");
        String firstString = input.next();
		
		
		System.out.println("Enter Second String :");
        String secondString= input.next();
		
        boolean result=isAnagram(firstString,secondString);	
		System.out.println("Are strings "+firstString+" and "+secondString+" anagram? "+result);
		input.close();
	 }
}