import java.util.Scanner;

class CheckPrime{

    boolean isPrime(int number){
        if(number<2){
            return false;
        }
       for(int i=2;i<=number/2;i++){
           if(number%i==0){
            return false;
           }
       }
       return true;
    }

    void display(boolean result){
        System.out.println("The given number is a prime number: "+result);
    }
}
class PrimeNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=input.nextInt();
        CheckPrime checkPrime=new CheckPrime();
        boolean result=checkPrime.isPrime(number);
        checkPrime.display(result);

        input.close();
    }
}
