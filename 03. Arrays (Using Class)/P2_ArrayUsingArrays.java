import java.util.Arrays;

class P2_ArrayUsingArrays {
    public static void main(String[] args) {
        int a[] = new int[7];
        System.out.println(Arrays.toString(a));

        // Replacement Operation
        Arrays.fill(a, 1, 3, 3); // fills the array

        System.out.println(Arrays.toString(a));

        // Sorting Operation
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        // Searching Operation
        System.out.println(Arrays.binarySearch(a, 3));

        Arrays.parallelSort(a);
        System.out.println(Arrays.toString(a));

    }
}