import java.util.Random;
import java.util.Scanner;

public class EligibleForVoting {

    public static int[] generateRandomAges(int numberOfStudents) {
        int[] ages = new int[numberOfStudents];
        Random random = new Random();
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = random.nextInt(90) - 10;
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    public static void displayResults(String[][] result) {
        System.out.println("Age\t\tVoting Eligibility");
        System.out.println("-----------------------------");
        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students in the class: ");
        int numberOfStudents = scanner.nextInt();

        int[] ages = generateRandomAges(numberOfStudents);

        String[][] eligibilityResults = checkVotingEligibility(ages);

        displayResults(eligibilityResults);

        scanner.close();
    }
}
