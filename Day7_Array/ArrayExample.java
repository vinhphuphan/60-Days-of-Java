public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers; // Declaring the array but not taking space
        numbers = new int[5]; // Initializing
        int[] numbers2 = {1,2,3,4,5};
        // [1][2][3][4][5]
        numbers2[0] = 420;
        int firstNum = numbers2[0];
        System.out.println(firstNum);
    }
}