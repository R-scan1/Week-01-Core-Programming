import java.util.Scanner;
public class DoubleOpt{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input  
		  double a=input.nextDouble();
		  double b=input.nextDouble();
		  double c=input.nextDouble();
		  
		//calculating
		  double d=a+b*c;
		  double e=a*b+c;
		  double f=c+a/b;
		  double g=a%b+c;
		  
		//displaying the result
          System.out.println("The results of double Operations are "+d+", "+e+", " +f+",and "+g);		
		  
		  input.close();
	  }  
}