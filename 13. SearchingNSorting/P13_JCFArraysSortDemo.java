import java.util.*;

class P13_JCFArraysSortDemo {
    public static void main(String args[]) {
        // Allocate and initialize array.
        int array[] = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = -3 * i; // Alternatively, you can load random numbers
        System.out.print("Original contents: ");
        System.out.println(array);
        Arrays.sort(array);
        System.out.print("Sorted: ");
        System.out.println(array);
    }
}