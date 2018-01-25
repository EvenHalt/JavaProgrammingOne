package Chapter2;

import java.util.Scanner;
/**
 * Program to display the price of food
 *
 * @author Evan Holt
 */

public class P2 {
/**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Meal Drink Dessert: ");

        double meal = input.nextDouble();
        double drink = input.nextDouble();
        double dessert = input.nextDouble();

        double tax = (meal + drink + dessert) * .10;
        double tip = (meal + drink + dessert + tax) * .15;
        double total = meal + drink + dessert + tax + tip;

        System.out.print("Tax is " + tax);
        System.out.print(" Tip is " + tip);
        System.out.print(" Total is " + total);
    }
}
