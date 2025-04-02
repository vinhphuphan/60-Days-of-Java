public class Typecasting {
    public static void main(String[] agrs) {
        // Implicit casting
        int numInt = 10;
        System.out.println(numInt);
        double numDouble = numInt;
        System.out.println(numDouble);

        // Explicit casting from double to int (with loss!)
        double numDouble2 = 10.5;
        int numInt2 = (int) numDouble2;
        System.out.println(numDouble2);
        System.out.println(numInt2); // from 10.5 to 10

    }
}
