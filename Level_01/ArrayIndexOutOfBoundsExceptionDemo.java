import java.util.Scanner;


public class ArrayIndexOutOfBoundsExceptionDemo {

    public static void generateException(String [] arrayOfNames){
		try{
		   String name=arrayOfNames[arrayOfNames.length];
		}
		catch(ArrayIndexOutOfBoundsException e){
			handleException(e);
		}
		catch(RuntimeException e){
			handleException2(e);
		}
		
	}
	
	public static void handleException(Exception e){
		System.out.println("Exception Occured : "+e.getMessage());
	}
	
	public static void handleException2(Exception e){
		System.out.println("Generic Exception Occured : "+e.getMessage());
	}

    public static void main(String[] args){
		
        Scanner input =new Scanner(System.in);
		String [] arrayOfNames=new String[3];
		
		for(int i=0;i<arrayOfNames.length;i++){
		System.out.println("Enter your name :");
		String text=input.next();
		}
		generateException(arrayOfNames);
		
		input.close();
	
    }
}