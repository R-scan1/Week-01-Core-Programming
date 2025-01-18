import java.util.Scanner;

class Calculation{
    char ch;
    double num1;
    double num2;

    Calculation(char ch,double num1,double num2){
        this.ch=ch;
        this.num1=num1;
        this.num2=num2;
    }

    double operations(){
        double result;
        if(ch=='+'){
        result=addition();
        }else if(ch=='-'){
        result=substraction();
        }else if(ch=='*'){
        result=multiplication();
        }else{
        result=division();
        }
        return result;
        }                                                                                                                                                                                   
                                                                                                                                                                                    
        private double division() {
            return num1/num2;
        }                                                                                                                                                                                
                                                                                                
        private double multiplication() {
            return num1*num2;
        }                                                                                                                                                                                
                                                
        private double substraction() {
            return num1-num2;
        }                                                                                
                        
        private double addition() {
            return num1+num2;
        } 
        
        void display(double result){
             System.out.printf("After performing "+ch+" operation in "+num1+" and "+num2+" answer would be : %.2f",result);
        }

    
}
public class BasicCalculator {
   public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter first number : ");
       double num1=input.nextDouble();
       System.out.println("Enter second  number : ");
       double num2=input.nextDouble();
       System.out.println("Enter the operation to perform +|*|/|- :");
       char ch=input.next().charAt(0);

       Calculation calculation=new Calculation(ch, num1, num2);
       double result=calculation.operations();
       calculation.display(result);

       input.close();
   } 
}
