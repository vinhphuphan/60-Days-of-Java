import java.util.Scanner;

public class userInputWithText {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Welcome to Java, " + name + "!");
        scanner.close();
    }
}