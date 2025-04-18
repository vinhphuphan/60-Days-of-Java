public class SmartDevice {
    // Member variables (fields)
    String brand;
    String model;
    int batteryLife = 0;
    boolean isConnected = false;

    void Connect() {
        isConnected = true;
    }

    void disconnect() {
        isConnected = false;
    }

    void displayStatus() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Battery Life : " + batteryLife);
        System.out.println("Connected : " + isConnected);
    }
}
