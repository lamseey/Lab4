package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        int SALESPEOPLE;
        int sum;
        Scanner scan = new Scanner(System.in);
        // 6) Ask user for number of salespeople
        System.out.print("Enter number of salespeople: ");
        SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        for (int i=0; i<sales.length; i++)
        {
            // 5) Display with id starting at 1
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        // Initialize maxSaleId to 0 and maxSale to first element
        int maxSaleId = 0;
        int maxSale = sales[0];

        // Initialize minSaleId to 0 and minSale to first element
        int minSaleId = 0;
        int minSale = sales[0];
        for (int i=0; i<sales.length; i++)
        {
            // Find max sale
            if (sales[i] > maxSale) {
                maxSale = sales[i];
                maxSaleId = i;
            }

            // Find min sale
            if (sales[i] < minSale) {
                minSale = sales[i];
                minSaleId = i;
            }
            // 5) Display with id starting at 1
            System.out.println(" " + (i + 1) + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);

        // 1) Average sale
        // cast to double to avoid integer division
        System.out.println("Average sale: " + (double)sum/SALESPEOPLE);

        // 2) Max sale
        System.out.println("Salesperson " + (maxSaleId + 1) + " had the highest sale with $" + maxSale + ".");

        // 3) Min sale
        System.out.println("Salesperson " + (minSaleId + 1) + " had the lowest sale with $" + minSale + ".");

        // 4) Above value entered by user
        System.out.print("Enter a sales amount to see who exceeded it: ");
        int threshold = scan.nextInt();
        int numberExceeded = 0;
        System.out.println("Salespeople who exceeded $" + threshold + ":");
        for (int i=0; i<sales.length; i++)
        {
            if (sales[i] > threshold) {
                // 5) Display with id starting at 1
                System.out.println("Salesperson " + (i + 1) + " with sales of $" + sales[i]);
                numberExceeded++;
            }
        }
        System.out.println("Number of salespeople who exceeded $" + threshold + ": " + numberExceeded);
    }
}