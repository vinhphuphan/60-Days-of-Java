import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7,3,8};
        String[] names = {"Frank", "Tank", "Crank"};
        System.out.println("Pre sorting Array : " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("Post sorting Array : " + Arrays.toString(nums));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        // binarySearch
        // Remember to sort the array before doing binarySearch
        int index = Arrays.binarySearch(nums, 7);
        System.out.println("Index of 7 in nums array is : " + index);
    
    
    }
}
