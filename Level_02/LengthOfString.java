import java.util.Scanner;


public class LengthOfString {

    public static int generateException(String text){
		int count=0;
		try{
		   while(true){
			    text.charAt(count);
				count++;
		   }
		}
		catch(StringIndexOutOfBoundsException e){
			handleException(e);
			return count;
		}
		catch(RuntimeException e){
			handleException2(e);
		}
		return count;
		
	}
	
	public static void handleException(Exception e){
		System.out.println("Exception Occured : "+e.getMessage());
	}
	
	public static void handleException2(Exception e){
		System.out.println("Generic Exception Occured : "+e.getMessage());
	}

    public static void main(String[] args){
		
        Scanner input =new Scanner(System.in);
		System.out.println("Enter the string :");
		String text=input.next();
		
		int length=generateException(text);
		System.out.println("Length of string using exception handling : "+length+"\nLength of string using length method :"+text.length());
		
		input.close();
	
    }
}