import java.util.Scanner;


public class SplitTheString {

    public static int countLength(String text){
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
	
	public static String [] splitString(String text,int length){
		String word="";
		word+=text.charAt(0);
		int count=1;
		for(int i=1;i<text.length();i++){
			if(text.charAt(i)==' '){
				count++;
			}
		}
		String [] split=new String[count];
		int len=0;
		for(int i=1;i<text.length();i++){
			if(text.charAt(i)==' '){
				split[len]=word;
				len++;
				word="";
			}
			if(text.charAt(i)!=' '){
			 word+=text.charAt(i);
			}
		}
		split[len]=word;
		return split;
		
	}
	
	public static boolean compareSplitMethod(String text,String [] split){
		String [] splitUsingMethod=text.split(" ");
		for(int i=0;i<split.length;i++){
			if(!splitUsingMethod[i].equals(split[i])){
				return false;
			}
		}
	   return true;
	}
	
	public static void handleException(Exception e){
		System.out.println("Exception Occured : "+e.getMessage());
	}
	
	public static void handleException2(Exception e){
		System.out.println("Generic Exception Occured : "+e.getMessage());
	}

    public static void main(String[] args){
		
        Scanner input =new Scanner(System.in);
		System.out.println("Enter the sentence :");
		String text=input.nextLine();
		
		int length=countLength(text);
		String [] split=splitString(text,length);
		for(int i=0;i<split.length;i++){
		System.out.println("Words in string after split "+split[i]);
		}
		boolean result=compareSplitMethod(text,split);
		System.out.println("Result after comparing words from split method and user defined split method, Are both arrays same! "+result);
		input.close();
	
    }
}