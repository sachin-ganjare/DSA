// Example 49.1: Programming for linear search algorithm
/* This program search an array of elements. The program works well whether
the array elements are in sorted order or not. */
class LinearSearch<T extends Comparable<T>> {
    public int search(T[] arr, T key, int len) {
        for (int i = 0; i < len; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }
}

// Continued to next...
class P1_LinearSearchDemo {
    public static void main(String args[]) {
        LinearSearch<Integer> l = new LinearSearch<Integer>();
        Integer arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        Integer key = 10;

        if (l.search(arr, key, n) == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index " + l.search(arr, key, n));
    }
}
