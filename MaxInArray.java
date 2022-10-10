public class MaxInArray {
    public static int largest(int[] array) {

        // declare a variable max
        int max = 0;

        // assign first element to max
        max = array[0];

        // compare with remaining elements
        // loop
        for (int i = 1; i < array.length; i++) {
            // compare
            if (max < array[i]) max = array[i];
        }

        return max;
    }
}
