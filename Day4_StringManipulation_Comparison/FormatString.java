public class FormatString {
    public static void main(String[] args) {
        String name = "Phu";
        int age = 27;
        String message = String.format("Hello, %s! You are %d years old", name, age);
        System.out.println(message);

        double price = 1234.567;
        String formatedPrice = String.format("The price is %.2f", price);
        System.out.println(formatedPrice);
    }
}
