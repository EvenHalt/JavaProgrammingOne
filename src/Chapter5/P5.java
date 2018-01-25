package Chapter5;

import java.util.Scanner;

/**
 * Program to How many votes a thing gets
 *
 * @author Evan Holt
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yesvotes = 0;
        int novotes = 0;
        int invvotes = 0;
        int totvotes = 0;
        String a;
        char b = 0;
        while (b != 'Q') {
            System.out.print("Enter \"Y\" to vote yes, \"N\" to vote no, or \"Q\" to quit voting. ");
            a = input.next().toUpperCase();
            b = a.charAt(0);
            if (b == 'Y') {
                yesvotes++;
            }
            if (b == 'N') {
                novotes++;
            }
            if (b != 'Y' && b != 'N' && b != 'Q') {
                System.out.print("Invalid input ");
                invvotes++;
            }
            totvotes++;
        }
        System.out.println("yes votes: " + yesvotes);
        System.out.println("no votes: " + novotes);
        System.out.println("invalid votes: " + invvotes);
        System.out.println("total votes: " + (totvotes - 1));

    }
}
