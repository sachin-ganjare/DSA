import java.util.*;

public class _03_NPTELArrayOperation_Insertion1DArray {
    static int[] a = new int[100];
    static int size = 0;

    public static void create(int n) {
        if (n > 100) {
            System.out.println("Could not initialize…");
            return;
        }
        size = n;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + "th number: ");
            a[i] = in.nextInt();
        }
        System.out.println("Capacity = " + a.length + " Size = " + size);
        System.out.println(Arrays.toString(Arrays.copyOf(a, size)));
        in.close();
    }

    public static void insert(int loc, int item) {
        if (size == a.length) {
            System.out.println("Array is overflow: Insertion fails…");
            return;
        }
        if (loc < 0 || loc > size) {
            System.out.println("Out of range: Insertion fails…");
            return;
        }
        for (int i = size; i > loc; i--) {
            a[i] = a[i - 1];
        }
        a[loc] = item;
        size++;
        System.out.println("Capacity = " + a.length + " Size = " + size);
        System.out.println(Arrays.toString(Arrays.copyOf(a, size)));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        create(n);

        System.out.println("Enter the new number to be inserted: ");
        int item = in.nextInt();
        System.out.println("At position? ");
        int pos = in.nextInt();

        insert(pos, item);

        System.out.println("Final Array: ");
        System.out.println(Arrays.toString(Arrays.copyOf(a, size)));
        in.close();
    }
}
