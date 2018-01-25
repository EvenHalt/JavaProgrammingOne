
package Chapter3;

import java.util.Scanner;

/**
 * Program to display if an integer is divisible by 5 or 6
 *
 * @author Evan Holt
 */

public class C3_26 {
/**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println("Is 10 divisible by 5 and 6? "
                + ((number % 5 == 0) && (number % 6 == 0)));
        System.out.println("Is 10 divisible by 5 or 6? "
                + ((number % 5 == 0) || (number % 6 == 0)));
        System.out.println("Is 10 divisible by 5 of 6, but not both? "
                + ((number % 5 == 0) ^ (number % 6 == 0)));
    }
}
