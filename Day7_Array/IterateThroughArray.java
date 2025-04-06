public interface IterateThroughArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        
        // for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d " , numbers[i]);
        }
    }
}
