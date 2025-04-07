public class ArrayExample {
    public static void main(String[] args) {
        int[][] my2DArray = new int[3][3];
        my2DArray[0][0] = 1;
        my2DArray[0][1] = 2;
        my2DArray[0][2] = 3;
        my2DArray[1][0] = 4;
        my2DArray[1][1] = 5;
        my2DArray[1][2] = 6;
        my2DArray[2][0] = 7;
        my2DArray[2][1] = 8;
        my2DArray[2][2] = 9;

        // for (int i = 0; i < my2DArray.length; i++) {
        //     for (int j = 0; j < my2DArray[i].length; j++) {
        //         System.out.println(my2DArray[i][j] + " ");
        //     }
        // }

        // for ( int[] row : my2DArray) {
        //     for ( int element : row) {
        //         System.out.println(element);
        //     }
        // }

        int[][] new2DArray = {
            {1,2,3},
            {5,6,7},
            {8,9,10}
        };

        for ( int[] row : new2DArray) {
            for ( int element : row) {
                System.out.printf("%d ", element);
            }
            System.out.println();
        }
    }
}