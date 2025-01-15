import java.util.Scanner;
import java.lang.Integer;

public class NumberFormatExceptionDemo {

    public static void generateException(String text){
		try{
		   int number=Integer.parseInt(text);
			
		}
		catch(NumberFormatException e){
			handleException(e);
		}
		catch(RuntimeException e){
			handleException2(e);
		}
		
	}
	
	public static void handleException(Exception e){
		System.out.println("NumberFormatException Occured : "+e.getMessage());
	}
	
	public static void handleException2(Exception e){
		System.out.println("Generic Exception Occured : "+e.getMessage());
	}

    public static void main(String[] args){
		
        Scanner input =new Scanner(System.in);
		
		System.out.println("Enter a string :");
		String text=input.next();
		
		generateException(text);
		
		input.close();
	
    }
}