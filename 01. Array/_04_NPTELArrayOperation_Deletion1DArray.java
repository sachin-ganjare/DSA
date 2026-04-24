import java.util.*;

public class _04_NPTELArrayOperation_Deletion1DArray {
    static int[] a = new int[100]; // array with capacity 100
    static int size = 0; // number of items present

    public static void create(int n) {
        if (n > 100) {
            System.out.println("Could not initialize…");
            return;
        }
        size = n;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + "th number: ");
            a[i] = in.nextInt();
        }
        System.out.println("Capacity = " + a.length + " Size = " + size);
        System.out.println(Arrays.toString(Arrays.copyOf(a, size)));
        in.close();
    }

    public static int delete(int loc) {
        if (size == 0) {
            System.out.println("Array is underflow: No item to delete!");
            return -1;
        }
        if (loc < 0 || loc >= size) {
            System.out.println("Out of range: Deletion fails...");
            return -1;
        }

        int item = a[loc]; // item at position
        // shifting left
        for (int i = loc; i < size - 1; i++) {
            a[i] = a[i + 1];
        }
        a[size - 1] = 0; // clear last element
        size--;

        System.out.println("Capacity = " + a.length + " Size = " + size);
        System.out.println(Arrays.toString(Arrays.copyOf(a, size)));
        return item;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        create(n);

        System.out.println("Enter the position to delete (0-based index): ");
        int pos = in.nextInt();

        int item = delete(pos);
        if (item != -1) {
            System.out.println("Deleted item: " + item);
        }

        System.out.println("Final Array: ");
        System.out.println(Arrays.toString(Arrays.copyOf(a, size)));
        in.close();
    }
}
