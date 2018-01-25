package Chapter2;

import java.util.Scanner;
/**
 * Program to display the gratuity and total 
 *
 * @author Evan Holt
 */

public class C2_5 {
/**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityr = input.nextDouble();
        double gratuity = gratuityr / 100 * subtotal;
        double total = gratuity + subtotal;
        System.out.print("The gratuity is " + gratuity + " and total is " + total);
    }
}
