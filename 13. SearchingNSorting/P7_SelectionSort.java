public class P7_SelectionSort<T extends Comparable<T>> {
    public static <T extends Comparable<T>> void selectionSort(T[] arr, int len) {
        for (int i = 0; i < (len - 1); i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[minIndex].compareTo((arr[j])) > 0) {
                    minIndex = j;
                }
            }
            T temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Continued to next..
    /* The following method is an auxiliary method to print an array. */
    public static <T> void printArray(T[] arr, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /* The main method to test the program. */
    public static void main(String[] args) {
        Integer[] arr = { 89, 45, 95, 23, 41, 13, 63 };
        int n = arr.length;
        System.out.println("Given Array:");
        printArray(arr, n);
        selectionSort(arr, n);
        System.out.println("\nAfter sorting:");
        printArray(arr, n);
    }
} // En