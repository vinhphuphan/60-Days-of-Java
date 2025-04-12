import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // Declare and initialize
        int[] arr = {4,3,1,5,7,12,6,9,10,16,18};
        Scanner scanner = new Scanner(System.in);
        // Sort the array before doing binary search
        Arrays.sort(arr);

        System.out.print("The given array is :");
        for(int element : arr) {
            System.err.printf("%d ", element);
        }
        
        // Get user input
        System.out.print("\nWhat number you want to find : ");
        int target = scanner.nextInt();
        // Binary search
        int targetIndex = binarySearch(arr, target);

        // Print out
        System.out.printf("The index of %d is %d", target, targetIndex );
        
        scanner.close();
    }

    public static int binarySearch(int[] arr, int target) {
        // Declare and initialize
        int low = 0;
        int high = arr.length - 1;

        // Searching loop
        while (low <= high) {
            int middle = (low + high)/2;

            if (arr[middle] == target) {
                return middle;
            } else if (target > arr[middle]) { // continue with the right half
                low = middle + 1;
            } else { // continue with the left half
                high = middle - 1;
            }
        }

        return -1;
    }
}
