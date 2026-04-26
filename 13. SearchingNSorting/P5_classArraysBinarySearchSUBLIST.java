
/* This program illustrates the use of Binary Search method within a sub
list. */
import java.util.Arrays;

public class P5_classArraysBinarySearchSUBLIST {
    public static void main(String[] args) {
        int intArr[] = { 10, 20, 15, 22, 35 }; // An int array as input
        Arrays.sort(intArr); // Sort the array
        int intKey = 22;
        System.out.println(intKey + " found at index = "
                + Arrays.binarySearch(intArr, 1, 3, intKey));
    }
}