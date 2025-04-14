public class App {
    public static void main(String[] args) throws Exception {
        Car myToyota = new Car();
        myToyota.color = "red";
        myToyota.model = "Toyota";
        myToyota.year = 2022;

        System.out.println("My toyota is " + myToyota.color);
    }
}
