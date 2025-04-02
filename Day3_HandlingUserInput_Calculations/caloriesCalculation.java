import java.util.Scanner;

public class caloriesCalculation {
    public static void main(String[] agrs) {
        System.out.println("Welcome to Calories Counter Pro!");

        // Step 1: Declare variables
        String food1, food2, food3;
        int calorie1, calorie2, calorie3;
        int totalCalorie;

        // Step 2: Initialize Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Step 3: Prompt user for first food item and its calories
        System.out.println("Enter the name of the first food item: ");
        food1 = scanner.nextLine();
        System.out.print("Enter the calories for " + food1 + ": ");
        calorie1 = scanner.nextInt();
        scanner.nextLine(); // consume the new line 

        // Step 4: Prompt user for second food item and its calories
        System.out.println("Enter the name of the second food item: ");
        food2 = scanner.nextLine();
        System.out.print("Enter the calories for " + food2 + ": ");
        calorie2 = scanner.nextInt();
        scanner.nextLine(); // consume the new line 

        // Step 5: Prompt user for third food item and its calories
        System.out.println("Enter the name of the third food item: ");
        food3 = scanner.nextLine();
        System.out.print("Enter the calories for " + food3 + ": ");
        calorie3 = scanner.nextInt();
        scanner.nextLine(); // consume the new line 
        
        // Step 6: Calculate total calorie intake
        totalCalorie = calorie1 + calorie2 + calorie3;

         // Step 7: Display the summary
        System.out.println("\nYour Calorie Intake:");
        System.out.println("1. " + food1 + " - " + calorie1 + " calories");
        System.out.println("2. " + food2 + " - " + calorie2 + " calories");
        System.out.println("3. " + food3 + " - " + calorie3 + " calories");
 
        // Step 8: Display total calories
        System.out.println("\nTotal Calorie Intake: " + totalCalorie + " calories");
 
        // Step 9: Thank the user and close Scanner
        System.out.println("Thank you for using Calorie Counter Pro!");
        scanner.close();
    }
}
