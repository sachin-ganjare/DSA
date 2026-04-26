class GenericArraySorting<T extends Comparable<T>> {
    T a[];

    GenericArraySorting(T x[]) { // Define a constructor
        a = x;
    }

    T getData(int i) { // To return the element stored in the i-th place
        return a[i];
    }

    void printData() { // A generic method to print the elements in array a
        for (int i = 0; i < a.length; i++)
            System.out.print(this.getData(i) + " "); // Print the i-th element in a
        System.out.println(); // Print a new line
    }

    /* This method for partition is defined below. */
    int partition(T arr[], int low, int high) {
        T pivot = arr[high];
        int i = (low - 1); // index of the left most element
        T temp;
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                temp = arr[i]; // swap arr[i] and arr[j]
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i+1] and arr[high] (or pivot)
        temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    /* This method define quick sort recursively. */
    void quickSort(int low, int high) {
        if (low < high) {
            /* pi is partitioning index */
            int pi = partition(a, low, high);
            // Recursively sort elements in the two partitioned lists
            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
        }
    }
} // End of the generic class
/* This method apply quick sort. */

public class P11_QuickSort {
    public static void main(String[] args) {
        Integer i[] = { 59, 44, 79, 74, 88 };
        // Store the data into generic array
        GenericArraySorting<Integer> arrayIntObj = new GenericArraySorting<Integer>(i);
        // Printing the data….
        System.out.print("Array Before Sorting : ");
        arrayIntObj.printData();
        arrayIntObj.quickSort(0, i.length - 1);
        System.out.print("Sorted Array is : ");
        arrayIntObj.printData();
        System.out.println();
        /* This method apply quick sort to string data. */
        String st[] = { "deepak", "debasis", "data", "subhra", "zeeshan" };
        // Store the data into generic array
        GenericArraySorting<String> arrayString = new GenericArraySorting<String>(st);
        // Printing the data….
        System.out.print("Array Before Sorting : ");
        arrayString.printData();
        arrayString.quickSort(0, i.length - 1);
        System.out.print("Sorted Array is : ");
        arrayString.printData();
    }
}
