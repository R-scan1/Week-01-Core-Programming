import java.util.Scanner;

public class Handshakes2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking input from the user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        if (numberOfStudents < 2) {
            System.out.println("A minimum of 2 students is required to make handshakes.");
        } else {
            //calculating the condition
            int totalHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

            //displaying the result
            System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + totalHandshakes);
        }

        input.close();
    }
}

