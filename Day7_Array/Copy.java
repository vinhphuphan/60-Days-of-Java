import java.lang.reflect.Array;
import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7,3,8};
        System.out.println("nums : " + Arrays.toString(nums));

        // copy by value
        int[] backupOfNums = Arrays.copyOf(nums, nums.length);
        
        // copy array by reference
        int[] copyByReference = nums; // copy by reference mean backupOfNums will has the nums address
        Arrays.sort(nums);
        System.out.println("Copy of Nums value : " + Arrays.toString(backupOfNums));
        System.out.println("Copy of Nums reference : " + Arrays.toString(copyByReference));
        
    }
}