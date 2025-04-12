import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        // Declare and initialize with duplicate elements
        int[] orgArr = {1,2,4,5,6,5,4,3,5,2,9,10};

        // removeDuplicate
        int[] newArr = removeDuplicate(orgArr);

        // Print out
        System.out.print("The original array : ");
        for (int element : orgArr) {
            System.out.printf("%d ", element);
        }

        System.out.print("\nThe array after removing duplicates : ");
        for (int element : newArr) {
            System.out.printf("%d ", element);
        }

        
    }

    public static int[] removeDuplicate(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int element : arr) {
            set.add(element);
        }
        
        int[] newArr = new int[set.size()];
        int i=0;
        for (int num: set) {
            newArr[i++] = num;
        }
        return newArr;
    }
}
