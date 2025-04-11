import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        // Declare and initialize variables
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a whole number : ");
        int userInput = scanner.nextInt();
        int result = factorial(userInput);
        System.out.printf("%d! = %d " , userInput, result);  
        scanner.close();  
    }

    public static Integer factorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number*factorial(number-1);
        }
    }
}

// factorial(3)  
//      --> 3*factorial(2)
//            --> 3*2*factorial(1)
//                --> 3*2*1*factorial(0)
//                  ---> 3*2*1*1