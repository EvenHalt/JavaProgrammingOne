package Chapter8;

/**
 * Program to display total hours 2 dimensional arrays
 *
 * @author Evan Holt
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // Declare, create and initialize array
        int[][] employeeWorkHours = {
            {2, 4, 3, 4, 5, 8, 8}, // Employee 0
            {7, 3, 4, 3, 3, 4, 4}, // Employee 1
            {3, 3, 4, 3, 3, 2, 2}, // Employee 2
            {9, 3, 4, 7, 3, 4, 1}, // Employee 3
            {3, 5, 4, 3, 6, 3, 8}, // Employee 4
            {3, 4, 4, 6, 3, 4, 4}, // Employee 5
            {3, 7, 4, 8, 3, 8, 4}, // Employee 6
            {6, 3, 5, 9, 2, 7, 9}, // Employee 7
        };

        // Store the total hours for each row
        int[] weeklyHours = new int[employeeWorkHours.length];
        for (int r = 0; r < employeeWorkHours.length; r++) {
            for (int c = 0; c < employeeWorkHours[r].length; c++) {
                weeklyHours[r] += employeeWorkHours[r][c];
            }
        }

        // Display array
        showArray(employeeWorkHours, weeklyHours);

        // Extra credit portion
        int[] indexList = new int[weeklyHours.length];
        // Sort weeklyHours
        sortAndKeepIndex(weeklyHours, indexList);

        // Display result
        System.out.println("\n\nExtra credit output");
        for (int i = weeklyHours.length - 1; i >= 0; i--) {
            System.out.println("Employee " + indexList[i] + ": " + weeklyHours[i]);
        }
    }

    /**
     * Display the contents of the array
     *
     * @param employeeWorkHours daily work hours of each employee
     * @param weeklyHours storage for the total weekly hours
     */
    public static void showArray(int[][] employeeWorkHours, int[] weeklyHours) {
        System.out.println("\t\t\tSu\tM\tT\tW\tTh\tF\tSa\tTotal");
        for (int r = 0; r < employeeWorkHours.length; r++) {
            System.out.print("Employee " + r + "\t");
            for (int c = 0; c < employeeWorkHours[r].length; c++) {
                System.out.print("\t" + employeeWorkHours[r][c]);
            }
            System.out.println("\t" + weeklyHours[r]);
        }
    }

    // Extra credit method
    /**
     * Method for sorting the numbers
     *
     * @param list array
     * @param indexList array indexes
     */
    public static void sortAndKeepIndex(int[] list, int[] indexList) {
        int currentMax;
        int currentMaxIndex;

        // Initialize indexList
        for (int i = 0; i < indexList.length; i++) {
            indexList[i] = i;
        }

        for (int i = list.length - 1; i >= 1; i--) {
            // Find the maximum in the list[0..i]
            currentMax = list[i];
            currentMaxIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            // Swap list[i] with list[currentMaxIndex] if necessary;
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;

                // Swap the index in indexList too
                int temp = indexList[i];
                indexList[i] = indexList[currentMaxIndex];
                indexList[currentMaxIndex] = temp;
            }
        }
    }
}
