import java.util.Scanner;

public class MultipleOfNumber {
    public static void main(String[] args) {
	
        
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // calculating multiples and displaying it 
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
        
        input.close();
    }
}