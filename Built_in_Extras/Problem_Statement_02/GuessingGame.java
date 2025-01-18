import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static int guess;
    public static int start;
    public static int end;

    public static int generateRandom(int start, int end) {
        if (start >= end) {
            return start; 
        }
        Random r = new Random();
        return r.nextInt(end - start + 1) + start; 
    }

    public static int feedBack(String feedback) {
        if (feedback.equals("high")) {
            end = guess - 1; 
        } else if (feedback.equals("low")) {
            start = guess + 1; 
        }
        return guess = generateRandom(start, end); 
    }

    public static void display(int guess) {
        System.out.println("My guess is: " + guess);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        start = 1; 
        end = 100; 

        System.out.println("Think of a number between 1 and 100:");
        System.out.println("Take your time and press 'y' when you are ready:");
        char decision = input.next().charAt(0);

        if (decision == 'y' || decision == 'Y') {
            guess = generateRandom(start, end); 
            String feedback = "";

            while (!feedback.equals("correct")) {
                display(guess);
                System.out.println("Please give your feedback (high/low/correct):");
                feedback = input.next();
                if (feedback.equals("high") || feedback.equals("low") || feedback.equals("correct")) {
                    guess = feedBack(feedback); 
                } else {
                    System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
                }
            }
            System.out.println("Thank you for playing the game!!!");
        }

        input.close();
    }
}
