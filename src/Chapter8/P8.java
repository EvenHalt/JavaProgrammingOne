package Chapter8;

import java.util.Scanner;

/**
 * Program to track a sales man total sales
 *
 * @author Evan Holtd
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // Declaring variables
        Scanner keyboard = new Scanner(System.in);
        String[] salesmanID = {"A", "B", "C", "D"};
        String[] dayID = {"M", "T", "W", "H", "F"};
        double[][] saleAmount = new double[salesmanID.length][dayID.length];
        String theSalesman, theDay, reply;
        int salesman, day;
        double amount;

        // Obtaining input
        do {
            // Checking the right saleman ID is entered
            do {
                System.out.print("Enter the salesman ID as A, B, C, or D:  ");
                theSalesman = keyboard.next();
                salesman = search(salesmanID, theSalesman);
                if (salesman < 0) {
                    System.out.println("Please enter a valid salesman ID");
                }
            } while (salesman < 0);
            // Checking the right day ID is entered
            do {
                System.out.print("Enter the day as M, T, W, H, or F:  ");
                theDay = keyboard.next();
                day = search(dayID, theDay);
                if (day < 0) {
                    System.out.println("Please enter a valid day");
                }
            } while (day < 0);

            System.out.print("Enter the amount of the sale for " + theSalesman + " on " + theDay + ":  ");
            amount = keyboard.nextDouble();
            saleAmount[salesman][day] += amount;
            // Asking for more data
            System.out.print("More data? Enter Y for more or N to stop.  ");
            reply = keyboard.next();
            while (!(reply.equalsIgnoreCase("y")) && !(reply.equalsIgnoreCase("n"))) {
                System.out.print("INVALID REPLY. Enter Y for more or N to stop.  ");
                reply = keyboard.next();
            }
        } while (reply.equalsIgnoreCase("y"));

        // Displaying output
        System.out.printf("%10s%8s%8s%8s%8s%8s\n", "Salesman", "M", "T", "W", "H", "F");
        for (int r = 0; r < salesmanID.length; r++) {
            System.out.printf("%10s", salesmanID[r]);
            for (int c = 0; c < dayID.length; c++) {
                System.out.printf("%8.2f", saleAmount[r][c]);
            }
            System.out.println();
        }
    }

    /**
     * Method to check if a value exists in a list
     *
     * @param list array to get searched
     * @param valueToFind value in the array we are looking for
     * @return index of the item found
     */
    public static int search(String[] list, String valueToFind) {
        int foundAt = -1;
        for (int i = 0; i < list.length && foundAt == -1; i++) {
            if (valueToFind.equalsIgnoreCase(list[i])) {
                foundAt = i;
            }
        }
        return foundAt;
    }
}
