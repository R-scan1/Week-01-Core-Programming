import java.util.Scanner;
public class MostFrequentCharacter {
   
	
	public static int [] frequent(String str){
		int[] temp={0,0};
		
		
			
		for(int i=0;i<str.length();i++)
		{
			int count=0;
			char word='a';
			for(int j=0;j<str.length();j++)
			{
				word=str.charAt(i);
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
				
			}
		if(count>temp[0]){
			temp[0]=count;
			temp[1]=word;
		}
		
	}
	return temp;
	}
	
  
	 public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
        System.out.println("Enter  String :");
		String str1= input.nextLine();
		
		int[] result= frequent(str1);
		
		System.out.println("Most Frequent Character is: "+(char)result[1]+" and its occurence Count is: "+result[0]);
		
        		
		
	 }
}