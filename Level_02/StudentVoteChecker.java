import java.util.Scanner;

public class StudentVoteChecker {

   
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker voteChecker = new StudentVoteChecker();

       
        int[] studentAges = new int[10];

       
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

       
        for (int i = 0; i < 10; i++) {
            boolean canVote = voteChecker.canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " with age " + studentAges[i] + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + studentAges[i] + " cannot vote.");
            }
        }

        scanner.close();
    }
}