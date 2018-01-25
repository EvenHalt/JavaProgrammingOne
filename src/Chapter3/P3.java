
package Chapter3;

import java.util.Scanner;

/**
 * Program to display the comparison of 2 numbers
 *
 * @author Evan Holt
 */

public class P3 {
/**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double First = input.nextDouble();
        System.out.print("Enter second number: ");
        double Second = input.nextDouble();

        if (First == Second) {
            System.out.println("The first number is equal to the second");
        }
        if (First != Second) {
            System.out.println("The first number is not equal to the second");
        }

        if (First <= Second) {
            System.out.println("The first number is less than or equal to the second");
        }
        if (First > Second) {
            System.out.println("The first number is greater than the second");
        }

        if (Second == 0) {
            System.out.println("Cannot divide by zero");
        }

        if ((First / Second) < 1) {
            System.out.println("Proper Fraction");
        } else {
            System.out.println("Improper Fraction");
        }

        if (First < 60) {
            System.out.println("F");
        }
        if (First >= 60) {
            System.out.println("D");
        }
        if (First >= 70) {
            System.out.println("C");
        }
        if (First >= 80) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }

        if (Second > 1 && Second < 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}
