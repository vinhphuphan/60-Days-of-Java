public class ArrayCalculation {
    public static void main(String[] args) {
        int[] numbers = {1,12,33,45,5,7};
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }

            sum += number;
        }


        System.out.println("Sum of number array : " + sum);
        System.out.println("Min of number array : " + min);
        System.out.println("Max of number array : " + max);
        
    }
}
