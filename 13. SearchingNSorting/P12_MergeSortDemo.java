/* This program defines a generic class to store a collection. */
class MergeSort<T extends Comparable<T>> {
    void merge(T arr[], int l, int m, int r, T d1[], T d2[]) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
        /* Create temp arrays */
        T L[] = d1;
        T R[] = d2;
        /* Copy data to temp arrays */
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        /* Merge the temp arrays */
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using merge()
    void mergeSort(T arr[], int l, int r, T d1[], T d2[]) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;
            // Sort first and second halves
            mergeSort(arr, l, m, d1, d2);
            mergeSort(arr, m + 1, r, d1, d2);
            // Merge the sorted halves
            merge(arr, l, m, r, d1, d2);
        }
    }

    // Continued on...
    /* A utility function to print array of size n */
    void printArray(T arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
} // End of the progra

// Continued on...
class P12_MergeSortDemo {
    public static void main(String args[]) {
        Integer arr[] = { 12, 11, 13, 5, 6, 7 };
        MergeSort ob = new MergeSort();
        System.out.println("Given Array");
        ob.printArray(arr);
        Integer[] d1 = new Integer[7];
        Integer[] d2 = new Integer[7];
        ob.mergeSort(arr, 0, arr.length - 1, d1, d2);
        System.out.println("\nSorted array");
        ob.printArray(arr);
    }
}
