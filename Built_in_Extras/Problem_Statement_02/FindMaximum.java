import java.util.Scanner;

class MaximumOfThreeNumber {
   
    Scanner input=new Scanner(System.in);

      int[] takeInput(){
       int num[]=new int[3];
       System.out.println("Enter first number:");
       num[0]=input.nextInt();
       System.out.println("Enter second number:");
       num[1]=input.nextInt();
       System.out.println("Enter third number:");
       num[2]=input.nextInt();
       return num;
    }

    public int findMaximum(int [] num){
        return Math.max(Math.max(num[0], num[1]),Math.max(num[1], num[2]));
    }

    void display(int max){
        System.out.println("Maximum of these three integers is "+max);
    }
}
public class FindMaximum{
    public static void main(String[] args) {
        MaximumOfThreeNumber maximumOfThreeNumber=new MaximumOfThreeNumber();
        int [] num=maximumOfThreeNumber.takeInput();
        int max=maximumOfThreeNumber.findMaximum(num);
        maximumOfThreeNumber.display(max);
    }
}
