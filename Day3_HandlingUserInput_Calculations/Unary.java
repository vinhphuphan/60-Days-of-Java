public class Unary {
    public static void main(String[] agrs) {
        int a = 5;
        System.out.println("a = " + a);
        System.out.println("a minus 1....");
        int negative = -a;
        System.out.println("a = " + a);
        System.out.println("negative : " + negative);
        

        System.out.println("\nInitialize b = a++.....");
        int b = a++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("\nInitialize c = ++a.....");
        int c = ++a;
        System.out.println("a = " + a);
        System.out.println("c = " + c);
    } 
}
