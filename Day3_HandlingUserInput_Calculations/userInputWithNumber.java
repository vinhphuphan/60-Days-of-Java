import java.util.Scanner;

public class userInputWithNumber {
    public static void main(String[] agrs){
        // Initialize scanner object
        Scanner scanner = new Scanner(System.in);
        // Enter the name
        // System.out.println("Enter your name : ");
        // String name = scanner.nextLine();

        System.out.println("Enter your age : ");
        int age = scanner.nextInt();

        // System.out.println("Welcome to Java, " + name + "!");
        System.out.println("Your age is : " + age);
        scanner.close();
    }
}