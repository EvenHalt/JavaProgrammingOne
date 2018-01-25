
package Chapter3;

import java.util.Scanner;
import java.util.Random;
/**
 * Program to display the result of a coin flip
 *
 * @author Evan Holt
 */

public class C3_14 {
/**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Random random = new Random();
        int coinflip = random.nextInt(2);

        System.out.print("Enter 1 for heads, 0 for tails: ");
        int guess = in.nextInt();

        if (guess == coinflip) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
}
