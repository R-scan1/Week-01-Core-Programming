import java.util.*;
import java.lang.*;
public class ReplaceWord{
   
	
	public static String replaceWord(String text,String word,String newWord) {
		String firstPart="";
		String lastPart="";
		String result="";
		int [] index=findWord(text,word);
		if(index[0]==0 && index[1]==0){
			return "Word Not Found!";
		}
		if(index[0]>=0){
		for(int i=0;i<=index[0];i++){
			firstPart+=text.charAt(i);
		}
		}
		if(index[1]<text.length()){
		for(int i=index[1]+1;i<text.length();i++){
			lastPart+=text.charAt(i);
		}
		}
		result+=firstPart;
		result+=newWord;
		result+=lastPart;
		
		return result;
		
		
	}
	
	
	public static int [] findWord(String text, String word){
		String tempWord="";
		tempWord+=text.charAt(0);
		int [] index={0,0};
		int start=0;
		int i=1;
		for(i=1;i<text.length();i++){
			if(text.charAt(i)==' '){
				if(tempWord.equals(word)){
					index[0]=(i-tempWord.length())-1;
					index[1]=i-1;
					return index;
				}
				tempWord="";
			}else if(text.charAt(i)!=' '){
			tempWord+=text.charAt(i);
			}
		}
		if(tempWord.equals(word)){
					index[0]=(i-tempWord.length())-1;
					index[1]=i-1;
					return index;
				}
		return index;
	}
	
	
  
	 public static void main(String[] args) {
		
	    Scanner input= new Scanner(System.in);
        System.out.println("Enter a sentence");
        String text = input.nextLine();
		
		
		System.out.println("Enter the word to replace :");
        String word= input.next();
		
		System.out.println("Enter the new word:");
        String newWord= input.next();
		
		
        String result=replaceWord(text,word,newWord);	
		System.out.println("Sentence after replacement :"+result);
		input.close();
	 }
}