import java.util.Scanner;

class Fibonacci{
    int [] calculateFibonacci(int num){
        int sum=0;
        int [] fibo=new int[num];
        fibo[0]=0;
        fibo[1]=1;
        int start=0;
        int next=1;
        for(int i=2;i<fibo.length;i++){
            sum=start+next;
            fibo[i]=sum;
            start=next;
            next=sum;
        }
        return fibo;
    }

    void display(int [] fibo){
        System.out.println("The series of given size is : ");
        for(int i=0;i<fibo.length;i++){
            System.out.print(fibo[i]+" ");
        }
    }
}
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Fibonacci fibonacci=new Fibonacci();
        System.out.println("Enter the size of fibonacci series:");
        int size=input.nextInt();
        int [] fibo=fibonacci.calculateFibonacci(size);
        fibonacci.display(fibo);

        input.close();
    }
}
