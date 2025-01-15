import java.util.*;

public class StringIndexOutOfBoundsExceptionDemo {

    public static void generateException(String text){
		try{
			text.charAt(text.length());
			
		}catch(StringIndexOutOfBoundsException e){
			handleException(e);
		}
	}
	
	public static void handleException(Exception e){
		System.out.println("Exception Occured : "+e.getMessage());
	}

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String text=input.next();
		
		generateException(text);
		
	
    }
}