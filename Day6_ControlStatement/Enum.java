public class Enum {
    public enum Day {
        Monday, Tuesday, Wednesday,
        Thurday, Friday, Saturday, Sunday
    }

    public enum CoffeeSize {
        Small, Medium, Large
    }

    public static void main(String[] args) {
        double price;
        CoffeeSize size = CoffeeSize.Medium;
        switch (size) {
            case Small:
                price = 2.50;
                break;
            case Medium:
                price = 3;
                break;
            case Large:
                price = 4.50;
                break;
            default:
                price = 3;
                break;
        }

        System.out.printf("The coffee price is : %.2f%n", price);
    }
}
