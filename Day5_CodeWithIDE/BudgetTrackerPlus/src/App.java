import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Declare variables
        int monthlyIncome, rent, groceries, transportation, entertainment;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("📊 Budget Tracker Plus Program");
        System.out.println("Enter your monthly income : ");
        monthlyIncome = scanner.nextInt();

        System.out.println("\nLet's enter your expenses.\n🏠 Rent : ");
        rent = scanner.nextInt();

        System.out.print("🛒 Groceries: ");
        groceries = scanner.nextInt();

        System.out.print("🚗 Transportation: ");
        transportation = scanner.nextInt();

        System.out.print("🎮 Entertainment: ");
        entertainment = scanner.nextInt();

        // Close the scanner to advoid leakage
        scanner.close();

        // Calculate total expenses
        int totalExpense = rent + groceries + transportation + entertainment;
        // Calculate remaining budget
        int remainingBudget = monthlyIncome - totalExpense;
        // Percentage of income spent on each category
        double incomeOnRent = (double)  rent/monthlyIncome;
        double incomeOnGroceries = (double)  groceries/monthlyIncome;
        double incomeOnTransportation = (double)  transportation/monthlyIncome;
        double incomeOnEntertainment = (double)  entertainment/monthlyIncome;
        

        System.out.println("\n✅ Your Budget Summary:");
        System.out.printf("• Rent: %.2f%%\n", incomeOnRent * 100);
        System.out.printf("• Groceries: %.2f%%\n", incomeOnGroceries * 100);
        System.out.printf("• Transportation: %.2f%%\n", incomeOnTransportation * 100);
        System.out.printf("• Entertainment: %.2f%%\n", incomeOnEntertainment * 100);
        System.out.println("• Total Expenses: " + totalExpense);
        System.out.println("💰 Remaining Budget: " + remainingBudget);
        

    }
}
