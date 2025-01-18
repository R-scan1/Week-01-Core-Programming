import java.util.Scanner;

class GCD{

    boolean validateInput(int first,int second){
        if(first>0 && second>0){
            return true;
        }
        return false;
    }

    public int calculateGCD(int first, int second) {
        
        if(Math.max(first, second)%Math.min(first, second)==0){
            return Math.min(first, second);
        }
        for(int i=Math.min(first, second)/2;i>1;i--){
            if(i%Math.max(first,second)==0){
              return i;
            }
        }
        return 1;
    }
    
        public void display(int gcd) {
            System.out.println("GCD for the given two numbers is : "+gcd);
        }
         
}
    
class LCM{
            GCD gcd=new GCD();
            public int calculateLCM(int first, int second) {
                return (first*second)/gcd.calculateGCD(first,second);
            }
            
             public void display(int lcm) {
                System.out.println("LCM for the given two numbers is : "+lcm);        
             }
}
public class GCDAndLCMCalculator {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
                            
            System.out.println("Enter first integer :");
                int first=input.nextInt();
                    
                System.out.println("Enter second integer :");
                int second=input.nextInt();
                GCD gcd=new GCD();
                if(gcd.validateInput(first,second)){
                    int Gcd=gcd.calculateGCD(first,second);
                    gcd.display(Gcd);
                            
                    LCM lcm=new LCM();
                    int Lcm=lcm.calculateLCM(first,second);
                    lcm.display(Lcm);
                  }
                  else{
                     System.out.println("Enter valid positive number!!!");
                }
                    

        input.close();

    }
}
