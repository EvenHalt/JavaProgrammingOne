package Chapter7;

import java.util.Scanner;

/**
 * Program to display the minimum number in an array
 *
 * @author Evan Holt
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // Prompt the user to enter data 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] list = new double[10];

        // Enter the list numbers and store them in an array
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }

        // Display the output
        System.out.println("The minimum number is: " + min(list));
    }

    /**
     * Finds the smallest element in an array
     *
     * @param array array passed to the method
     * @return the minimum number in the array
     */
    public static double min(double[] array) {
        double minimumNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimumNumber) {
                minimumNumber = array[i];
            }
        }
        return minimumNumber;
    }
}
