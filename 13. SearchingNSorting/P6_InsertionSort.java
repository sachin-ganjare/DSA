/* This program sorts an array of data using Insertion sort technique. */
public class P6_InsertionSort {
    public static <T extends Comparable<T>> void insertionSort(T[] arr, int len) {
        for (int i = 0; i < len; i++) {
            int j = i;
            while (j > 0 && arr[j].compareTo(arr[j - 1]) > -1) {
                T temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j = j - 1;
            }
        }
    }

    public static <T> void printArray(T[] arr, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] arr = { 89, 45, 95, 63, 23, 41, 13, 78 };
        int n = arr.length;
        System.out.println("Given Array:");
        printArray(arr, n);
        insertionSort(arr, n);
        System.out.println("\nAfter sorting:");
        printArray(arr, n);
    }
} // End of the program