package Chapter6;

import java.util.Scanner;

/**
 * Convert Currencies
 *
 * @author Evan Holt
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many euros will a dollar buy?: ");
        final double euro = input.nextDouble();
        System.out.println("How many pounds will a dollar buy?: ");
        final double pound = input.nextDouble();
        System.out.println("How many yen will a dollar buy?: ");
        final double yen = input.nextDouble();

        String response = "";
        do {
            System.out.println("How many dollars:");

            double dollars = input.nextDouble();

            System.out.println("Do you want to buy E(Euros) P(Pounds) or Y(Yen) ");
            String currency = input.next().toUpperCase();

            switch (currency) {
                case "E":
                    System.out.printf("%.2f dollars = %.2f Euros", dollars, exchange(dollars, euro));
                    break;
                case "P":
                    System.out.printf("%.2f dollars = %.2f Pounds", dollars, exchange(dollars, pound));
                    break;
                case "Y":
                    System.out.printf("%.2f dollars = %.2f Yen", dollars, exchange(dollars, yen));
                    break;

            }
            do {
                System.out.print("\nAre there more conversions to perform?: ");
                response = input.next();
            } while (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no"));

        } while (response.equalsIgnoreCase("yes"));

    }

    public static double exchange(double dollars, double exchangeRate) {
        if (dollars > 100) {
            return dollars * 0.95 * exchangeRate;
        } else {
            return dollars * 0.90 * exchangeRate;
        }
    }
}
