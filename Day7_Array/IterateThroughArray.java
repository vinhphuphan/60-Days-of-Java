public interface IterateThroughArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        
        // for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d " , numbers[i]);
        }
        
        System.out.println();

        // enhanced for loop
        for (int number : numbers) {
            System.out.printf("%d " , number);
        }
        System.out.println();
        String[] friends = {"Trang", "Duc", "Pin","Dong", "Dinh","Thinh", "Huy"};
        for (String friend : friends) {
            System.out.println(friend + " is my friend!");
        }
    }
}
