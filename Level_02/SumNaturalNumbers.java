import java.util.Scanner;
public class SumNaturalNumbers {

   
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

   
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

       
        if (n <= 0) {
            System.out.println("The input is not a natural number. Exiting program.");
            scanner.close();
            return;
        }

       
        int sumFromRecursion = sumRecursive(n);

       
        int sumFromFormula = sumFormula(n);

       
        System.out.println("Sum of first " + n + " natural numbers (Recursion): " + sumFromRecursion);
        System.out.println("Sum of first " + n + " natural numbers (Formula): " + sumFromFormula);

        if (sumFromRecursion == sumFromFormula) {
            System.out.println("Both results are equal. The computation is correct.");
        } else {
            System.out.println("There is a discrepancy between the results.");
        }

        scanner.close();
    }
}