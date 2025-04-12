import java.util.Scanner;

public class CountNumOfDigits {
    public static void main(String[] args) {
        // Declare and initialize
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("This is the programm to count the number of digits in a given number!");
        System.out.print("Enter you number : ");
        int inputNumber = scanner.nextInt();

        // Count the digit
        int digits = countDigit(inputNumber);
        
        // Print out the result
        System.out.println("The number of digits on given number : " + digits);
        
        // Close the scanner
        scanner.close();
    }

    public static int countDigit(int num) {
        // Special case for 0
        if (num == 0) return 1;
        // Handle negative input
        num = Math.abs(num);
        // base case
        if (num < 1) return 0;
        // recursive case
        return 1 + countDigit(num / 10);
    }
}
