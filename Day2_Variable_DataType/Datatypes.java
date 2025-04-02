public class Datatypes {
    public static void main(String[] agrs) {
        // Part A - Primitive data types

        // 1. Whole number
        // byte 8 bit - (-128, 127)
        byte age = 36;
        // short 16 bit (-32 768, 32 767)
        short year = 2025; 
        // int 32 bit
        int population = 330000000;
        // long 64 bit
        long exampleLong = 80000000L;
        
        // 2. Float number
        // float, double for floating point numbers e.g. 
        // float 32bit
        float temperture = 25.1F;
        // double 64bit - more precise float - for big number in the floating point
        double pi = 3.14159265;

        // 3. Char - store a single character
        char myChar = 'A';


        // 4. Boolean
        boolean isAvailable = true;

        // Part B - Preference data types

        // 1. String
        String greeting = "Hello, Java";
        System.out.println(greeting);
        
        // Declare multiple variables at once
        int num1, num2, num3;
        num1 = 1;
        num2 = 2;
        num3 = 3;

    }
}
