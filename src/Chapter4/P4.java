package Chapter4;

import java.util.Scanner;
/**
 * Program to display the highest bid to the console
 *
 * @author Evan Holt
 */

public class P4 {
/**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Step 1
        System.out.println("Enter the first bidder");
        String first = input.next();
        //Step 2
        System.out.println("How many hours of work do they require");
        double firsthours = input.nextDouble();
        //Step 3
        System.out.println("How much do they charge per hour");
        double firstcost = input.nextDouble();
        //Step 4
        System.out.println("Enter the second bidder");
        String second = input.next();
        //Step 5
        System.out.println("How many hours of work do they require");
        double secondhours = input.nextDouble();
        //Step 6
        System.out.println("How much do they charge per hour");
        double secondcost = input.nextDouble();
        //Step 7
        double firsthourly = (firsthours * firstcost);
        //Step 8
        double secondhourly = (secondhours * secondcost);
        //Step 9
        if (firsthourly < secondhourly) {
            System.out.printf("The winner is %s with a total cost of %.2f and %.2f hours", first, firstcost, firsthours);
        }
        if (secondhourly < firsthourly) {
            System.out.printf("The winner is %s with a total cost of %.2f and %.2f hours", second, secondcost, secondhours);
        }
        if (firsthourly == secondhourly && firsthours < secondhours) {
            System.out.printf("The winner is %s with a total cost of %.2f and %.2f hours", first, firstcost, firsthours);
        }
        if (firsthourly == secondhourly && firsthours > secondhours) {
            System.out.printf("The winner is %s with a total cost of %.2f and %.2f hours", second, firstcost, secondhours);
        }
        if (firsthourly == secondhourly && firsthours == secondhours) {
            System.out.printf("%s and %s have identical bids", first, second);
            System.out.printf("\n%s has %f hours and %s has %.2f hours", first, firsthours, second, secondhours);
            System.out.printf("\n%s has $%f per hour and %s has $%.2f per hour", first, firstcost, second, secondcost);
            System.out.printf("\n%s has a total cost of $%.2f and %s has a total cost of $%.2f", first, firsthourly, second, secondhourly);
        }

    }
}
