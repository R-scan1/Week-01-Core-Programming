import java.util.Scanner;
public class SubString{
	
    public static String createSubstring(String text, int start, int end) {
        String result1="";
        for (int i = start; i < end; i++) {
        result1 += text.charAt(i);         }
        return result1;
    }
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
		
		
		System.out.println("Enter String ");
		String text=input.next();
		System.out.println("Enter Start index ");
		int start=input.nextInt();
		System.out.println("Enter end index ");
		int end=input.nextInt();
		
		String result1=createSubstring(text,start,end);
		String result2=text.substring(start,end);  
		
		System.out.println("Substring using  charAt method "+ result1);
		System.out.println("Substring using  substring  method "+ result2);
		System.out.println("String comparison result using charAt():"+stringComparison(result1,result2));
		System.out.println("String comparison result using equals():"+result1.equals(result2));
		
		input.close();
	
	}
}