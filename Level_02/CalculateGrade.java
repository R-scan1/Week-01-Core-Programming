import java.util.*;

public class CalculateGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents; 
        System.out.print("Enter the number of students: ");
        numberOfStudents = input.nextInt();
        //declaring 2D array
        double[][] marks = new double[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        //taking input using for loop
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[i][j] = input.nextDouble();

                while (marks[i][j] < 0) {
                    System.out.print("Invalid marks. Enter a positive value: ");
                    marks[i][j] = input.nextDouble();
                }
            }

            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;
            
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70 ) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
			} else if(percentages[i]>=50){
				grades[i]="D";
			}	else if(percentages[i]>=40){
				grades[i]="E";
            } else {
                grades[i] = "R";
            }
        }
        
		//displaying result using for loop
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + " - Marks: " + marks[i][0] + ", " + marks[i][1] + ", " + marks[i][2] +
                    ", Percentage: " + percentages[i] + ", Grade: " + grades[i]);
        }
    }
}
