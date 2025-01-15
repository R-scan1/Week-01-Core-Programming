import java.util.Scanner;


public class SplitAndCount{

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
	
	public static String [][] splitString(String text,int length){
		String word="";
		int wordLength=1;
		word+=text.charAt(0);
		int count=1;
		for(int i=1;i<text.length();i++){
			if(text.charAt(i)==' '){
				count++;
			}
		}
		String [][] splitAndCount=new String[2][count];
		int len=0;
		for(int i=1;i<text.length();i++){
			if(text.charAt(i)==' '){
				splitAndCount[0][len]=word;
				splitAndCount[1][len]=String.valueOf(wordLength);
				len++;
				word="";
				wordLength=0;
			}
			if(text.charAt(i)!=' '){
			 word+=text.charAt(i);
			 wordLength++;
			}
		}
		splitAndCount[0][len]=word;
		splitAndCount[1][len]=String.valueOf(wordLength);
		return splitAndCount;
		
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
		String [][] splitAndCount=splitString(text,length);
		for(int i=0;i<splitAndCount[0].length;i++){
		System.out.println("Words in string after split "+splitAndCount[0][i]+" and length of word is: "+splitAndCount[1][i]);
		}
		System.out.println("");
		input.close();
	
    }
}