import java.util.Scanner;
public class AreaOfTriangle{
       public static void main(String [] args){
		   
		//creating Scanner object
		  Scanner input=new Scanner(System.in);
		  
		//taking input 
          double base=input.nextDouble();
          double height=input.nextDouble();

        //calculating area of triangle
          double area=((double)1/2)*base*height;
        
	  //displaying the result
        System.out.println("Area of Triangle is :"+area);		  
	   }
}