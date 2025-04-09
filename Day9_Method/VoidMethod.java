public class VoidMethod {
    public static void main(String[] args) {
        sayHello();
        greeting("Phu");
    }

    public static void sayHello() {
        System.out.println("Hello world!");
    }

    public static void greeting(String name) {
        System.out.printf("Hi, %s! " , name);
    }
}