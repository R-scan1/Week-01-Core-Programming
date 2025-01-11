import java.util.Scanner;
public class IntOperation{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input  
		  int a=input.nextInt();
		  int b=input.nextInt();
		  int c=input.nextInt();
		  
		//calculating
		  int d=a+b*c;
		  int e=a*b+c;
		  int f=c+a/b;
		  int g=a%b+c;
		  
		//displaying the result
          System.out.println("The results of Int Operations are "+d+", "+e+", " +f+",and "+g);		
		  
		  input.close();
	  }  
}