package Chapter4;

import java.util.Scanner;
/**
 * Program to display how much an employee earned to the console
 *
 * @author Evan Holt
 */

public class C4_23 {
/**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee’s name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();

        double grossPay, federal, state, totalDeduction;
        grossPay = hoursWorked * hourlyPayRate;
        federal = grossPay * federalTaxRate;
        state = grossPay * stateTaxRate;
        totalDeduction = federal + state;

        System.out.printf("Employee Name: %s", name);
        System.out.printf("\n   Hours Worked: %.2f", hoursWorked);
        System.out.printf("\n   Pay Rate: $%.2f", hourlyPayRate);
        System.out.printf("\n   Gross Pay: $%.2f", grossPay);
        System.out.printf("\n   Deductions:   Federal Witholding (20.0%%): $%.2f", federal);
        System.out.printf("\n State Witholding (9.0%%): $%.2f", state);
        System.out.printf("\n   Total Deduction: $%.2f", totalDeduction);
        System.out.printf("\n   Net Pay: $%.2f", (grossPay - totalDeduction));
    }
}
