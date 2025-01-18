import java.util.Scanner;

class Factorial{
    int calculateFactorial(int num1,int num2){
        if(num1<0){
            return 0;
        }
        else if(num1==0){
            return 1;
        }
        num2--;
        if(num2==0){
            return num1;
        }
        return calculateFactorial(num1*num2, num2);
    }

    void display(int factorial){
        if(factorial==0){
            System.out.println("Enter a valid positive integer");
        }
        else{
        System.out.println("Factorial of the given number is :"+factorial);
        }
    }
}
public class FactorialFinder {
    public static void main(String[] args) {
        Factorial factorial=new Factorial();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number between 1 and 12 of which to find the factorial :");
        int number=input.nextInt();
        int result=factorial.calculateFactorial(number, number);
        factorial.display(result);

        input.close();
    }
}
