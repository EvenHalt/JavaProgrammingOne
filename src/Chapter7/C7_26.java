package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to check array equality
 *
 * @author Evan Holt
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // Prompt the user to enter data 
        Scanner input = new Scanner(System.in);

        // List 1
        System.out.print("Enter list1: ");
        int list1Size = input.nextInt();
        int[] list1 = new int[list1Size];
        fillArray(list1, input);

        // List 2
        System.out.print("Enter list2: ");
        int list2Size = input.nextInt();
        int[] list2 = new int[list2Size];
        fillArray(list1, input);

        // Display the output
        System.out.println(equals(list1, list2) ? "Two lists are strictly identical" : "Two lists are not strictly identical");
    }

    /**
     * Method to fill the array
     *
     * @param list array
     * @param input scanner object to get list from keyboard
     */
    public static void fillArray(int[] list, Scanner input) {
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
    }

    /**
     *
     * @param list1 first array
     * @param list2 second array
     * @return true or false if the lists are equal or not
     */
    public static boolean equals(int[] list1, int[] list2) {
        return Arrays.equals(list1, list2);
    }
}
