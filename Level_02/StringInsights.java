import java.util.Scanner;


public class StringInsights{
	
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
	
	
	public static String[][] classifyCharacters(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') ||
                (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U')) {
                result[i][1] = "Vowel";
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                result[i][1] = "Consonant";
            } else {
                result[i][1] = "Not a Letter";
            }
        }
        return result;
    }
	
	public static void displayTabular(String[][] result) {
        System.out.println("Character\tType");
        System.out.println("-----------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
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
	    String toggled = toggleCase(text);
        System.out.println("Result after toggle case " +toggled);
		String[][] classifiedCharacters = classifyCharacters(text);
		displayTabular(classifiedCharacters);
		input.close();
	}
}