import java.util.*;

public class IllegalArgumentExceptionDemo {

    public static void generateException(String text){
		try{
		   text.substring(text.length()-1,text.length()-2);
			
		}
		catch(StringIndexOutOfBoundsException e){
			handleException(e);
		}
		catch(IllegalArgumentException e){ //not possible to implement yet as we haven't studied the topic which produces Illegal Argument Exception
			handleException(e);
		}
	}
	
	public static void handleException(Exception e){
		System.out.println("Exception Occured : "+e.getMessage());
	}

    public static void main(String[] args){
		
        Scanner input =new Scanner(System.in);
		
		System.out.println("Enter a string :");
		String text=input.next();
		
		generateException(text);
		
		input.close();
	
    }
}