package Chapter7;

import java.util.Scanner;

/**
 * Program to practice arrays
 *
 * @author Evan Holt
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // Obtaining input
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will be read: ");
        int[] array = new int[input.nextInt()];
        System.out.print("Enter " + array.length + " elements: ");

        // Method calling
        fillArray(array, input);
        System.out.println("The average is " + arrayAverage(array));
        printArray(array);
    }

    /**
     * Method to fill the array
     *
     * @param array array being filled
     * @param input scanner object to get array from keyboard
     */
    public static void fillArray(int[] array, Scanner input) {
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
    }

    /**
     * Method to find the average
     *
     * @param array array
     * @return array average
     */
    public static double arrayAverage(int[] array) {
        int total = 0;
        for (int element : array) {
            total += element;
        }
        return (total / array.length);
    }

    /**
     * Method to print array
     *
     * @param array array
     */
    public static void printArray(int[] array) {
        System.out.println("The contents of the array:");
        System.out.println(java.util.Arrays.toString(array));
    }
}
