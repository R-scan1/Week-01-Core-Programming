import java.util.Scanner;

public class Handshakes{

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking input from the user 
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();

        if (students < 2) {
            System.out.println("There must be at least 2 students to form handshakes.");
        } else {
            //calculating the maximum number of handshakes possible
            int handshakes = calculateHandshakes(students);

            //displaying the result
            System.out.println("The maximum number of handshakes among " + students + " students is: " + handshakes);
        }

        input.close();
    }
}
