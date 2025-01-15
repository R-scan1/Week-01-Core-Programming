import java.util.*;

public class NullPointerExceptionDemo {

    public static void generateException(){
		try{
			String text=null;
			text.length();
			
		}catch(NullPointerException e){
			handleException(e);
		}
	}
	
	public static void handleException(Exception e){
		System.out.println("Exception Occured : "+e.getMessage());
	}

    public static void main(String[] args) {
        
		generateException();
		
	
    }
}