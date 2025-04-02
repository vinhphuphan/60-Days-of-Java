// Importing the necessary Java package for handling user input
import java.util.Scanner;

public class simpleCalculation {
    public static void main(String[] agrs) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the cost price and selling price
        System.out.println("Enter the cost price of the item:");
        double costPrice = scanner.nextDouble();

        System.out.println("Enter the selling price of the item:");
        double sellingPrice = scanner.nextDouble();

        // Calculate the profit or loss

        double profit = sellingPrice - costPrice;

        // Display the result with relational operators

        System.out.println("Profit: " + profit);

        // Demonstrate unary operators

        System.out.println("Demonstrating Unary Operators:");
        int unitSold = 10;
        System.out.println("Initial units sold: " + unitSold);
        System.out.println("Units sold after increment: " + (++unitSold));
        System.out.println("Units sold after derement: " + (--unitSold));

        // Demonstrate compound operators

        System.out.println("Demonstrating Compound Operators:");
        System.out.println("Total revenue after selling 10 units:$" + sellingPrice*unitSold);
        
        // Use the modulo operator

        System.out.println("Demonstrating Modulo Operators:");
        System.out.println("Remainder when units sold is divided by 3: " + unitSold%3);

        scanner.close();

    }
}