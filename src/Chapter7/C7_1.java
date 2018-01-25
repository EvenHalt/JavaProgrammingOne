package Chapter7;

import java.util.Scanner;

/**
 * Program to curve a student score
 *
 * @author Evan Holt
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // Prompt the user to enter data 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Create array and get the best score
        int[] scores = new int[numberOfStudents]; // Array scores
        int best = getBestScore(scores, input);

        // Display the output
        int a = 0;
        for (int x : scores) {
            System.out.println("Student " + (a++) + " score is " + x + " and grade is " + grade(x, best));
        }
    }

    /**
     * Read scores and find the best score
     *
     * @param scores student scores
     * @param input scanner object to get scores from keyboard
     * @return the highest score
     */
    public static int getBestScore(int[] scores, Scanner input) {
        int best = 0; // The best score
        // Read scores and find the best score
        System.out.print("Enter " + scores.length + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();

            if (scores[i] > best) {
                best = scores[i];
            }
        }
        return best;
    }

    /**
     * Method to return a grade
     *
     * @param score student score
     * @param best highest score
     * @return letter grade
     */
    public static char grade(int score, int best) {
        if (score >= (best - 10)) {
            return 'A';
        } else if (score >= (best - 20)) {
            return 'B';
        } else if (score >= (best - 30)) {
            return 'C';
        } else if (score >= (best - 40)) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
