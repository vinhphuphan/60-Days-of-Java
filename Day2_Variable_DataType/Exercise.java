public class Exercise {
    public static void main(String[] agrs) {
        // Declare and initialize variables of different types
        int wholeNumber = 10;
        double floatingPointNumber = 5.75;
        char singleCharacter = 'A';
        boolean isTrue = true;
        String text = "Java Programming";

        // Display the initialized variables
        System.out.println("Initial Variables:");
        System.out.println("Interger: " + wholeNumber);
        System.out.println("Double: " + floatingPointNumber);
        System.out.println("Char: " + singleCharacter);
        System.out.println("Boolean: " + isTrue);
        System.out.println("String: " + text);

        // Perform arithmetic operations
        System.out.println("\nPerforming Arithmetic Operations:");
        System.out.println("Sum of wholeNumber + 20: " + (wholeNumber+20));
        System.out.println("Division of floatingPointNumber by 2.0: " + (floatingPointNumber/2.0));

        // Demonstrate typecasting
        System.out.println("\nTypecasting Demonstration:");
        int floatToIntNumber = (int) floatingPointNumber;
        System.out.println("Casted floatingPointNumber to int: " + floatToIntNumber);

        // Manipulate string variables
        System.out.println("\nString Manipulation:");
        System.out.println("Combined String: " + text + " is fun!");
        
        // Demonstrate boolean logic
        System.out.println("\nBoolean Logic:");
        System.out.println("Negation of isTrue: " + !isTrue);
    }
}
