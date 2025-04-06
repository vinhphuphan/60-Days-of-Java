import java.util.Arrays;

public class Fill_equals {
    public static void main(String[] args) {
        int[] nums = new int[5];

        // fill method
        Arrays.fill(nums, 0,2,10);
        System.out.println(Arrays.toString(nums));

        Arrays.fill(nums, 2,5,11);
        System.out.println(Arrays.toString(nums));

        //  equals method - compare length , order, value
        int[] myNums = {10, 10, 11, 11, 11};
        System.out.println(Arrays.equals(nums, myNums));
    }
}
