public class App {
    public static void main(String[] args) throws Exception {
        Car myToyota = new Car();
        myToyota.color = "red";
        myToyota.model = "Toyota";
        myToyota.year = 2022;
        myToyota.showDetails();
        Car myAudi = new Car();
        myAudi.color = "black";
        myAudi.model = "A3";
        myAudi.year = 2011;
        myAudi.showDetails();
        System.out.println("My toyota is " + myToyota.color);
        System.out.println("My " + myAudi.model + " is " + myAudi.color);

        SmartDevice appleWatch = new SmartDevice();
        appleWatch.model = "Apple Watch";
        appleWatch.brand = "Apple";
        appleWatch.batteryLife = 24;
        appleWatch.displayStatus();
    }
}
