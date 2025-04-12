import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        // Declare and initialize with duplicate elements
        int[] orgArr = {1,2,4,5,6,5,4,3,5,2,9,10};

        // removeDuplicate
        int[] newArr = removeDuplicate(orgArr);
        System.out.print("The original array : ");
        for (int element : newArr) {
            System.out.printf("%d ", element);
        }

        System.out.println("\nThe array after removing duplicates : ");
        for (int element : newArr) {
            System.out.printf("%d ", element);
        }

        
    }

    public static int[] removeDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int element : arr) {
            set.add(element);
        }

        return set.toArray();
    }
}
