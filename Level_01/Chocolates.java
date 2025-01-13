import java.util.Scanner;

public class Chocolates {

    //calculating the chocolates distribution
    public static int[] findChocolatesDistribution(int numberOfChocolate, int numberOfChildrens) {
        int chocolatesPerChild = numberOfChocolate / numberOfChildrens;  
        int remainingChocolates = numberOfChocolate % numberOfChildrens; 

       
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking input from the user
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolate = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildrens = input.nextInt();

         //calling the method
            int[] result = findChocolatesDistribution(numberOfChocolate, numberOfChildrens);
      //displaying the results
            System.out.println("Each child will get: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        
        input.close();
    }
}
