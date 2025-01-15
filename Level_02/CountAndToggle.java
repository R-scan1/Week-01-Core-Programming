import java.util.Scanner;


public class CountAndToggle{
	
	public static int[] VowelsAndConso(String text)
	{
	    int[] arr= {0,0,0};
		for(int i=0;i<text.length();i++)
			
			{
				if((text.charAt(i)=='a') || (text.charAt(i)=='e') || (text.charAt(i)=='i') || (text.charAt(i)=='o') || (text.charAt(i)=='u'))
				{
					arr[0]++;
				}
				else if((text.charAt(i)>='a' && text.charAt(i)<='z')||(text.charAt(i)>='A' && text.charAt(i)<='Z'))
				{
					arr[1]++;
				}
                else{
					arr[2]++;
				}
				
			}
			return arr;
	}
	
	public static String toggleCase(String text) {
			 String result="";
			 for(int i=0;i<text.length();i++){
				if(text.charAt(i)<='Z' && text.charAt(i)>='A'){
					result+=(char)(text.charAt(i)+32);
				}
                else if(text.charAt(i)>='a' && text.charAt(i)<='z'){
					result+=(char)(text.charAt(i)-32);
				}				
			 }
			 return result;
    }
	
	
	public static void main(String args[])
	
	{
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter an String");
		String text= input.nextLine();
		int result[]=VowelsAndConso(text);
		System.out.println("Number of Vowels :"+result[0]);
		System.out.println("Number of consonents is :"+result[1]);
	    System.out.println("Number of characters which are not a letter :"+result[2]);
	    String result1 = toggleCase(text);
        System.out.println("Result after toggle case " +result1);
		input.close();
	}
}