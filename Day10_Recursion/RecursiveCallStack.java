public class RecursiveCallStack {
    public static void main(String[] args) {
        makeSandwich();
    }

    public static void getTwoSlicesOfBread() {
       buyBread();
       System.out.println("Take two slices of bread from the bread pack");

    }

    public static void buyBread() {
        System.out.println("Go out and buy bread!");
    }

    public static void makeSandwich() {
        getTwoSlicesOfBread();
        System.out.println("Add butter and cheese with bread then we got a sandwich!");
    }


}
