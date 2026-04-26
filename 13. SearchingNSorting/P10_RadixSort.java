class GenericRadixSort<T extends Number & Comparable<T>> {
    T a[];

    GenericRadixSort(T x[]) {
        a = x;
    }

    T getData(int i) {
        return a[i];
    }

    void printData() {
        for (int i = 0; i < a.length; i++)
            System.out.print(this.getData(i) + " ");
        System.out.println();
    }

    private long getMax() {
        long max = a[0].longValue();
        for (int i = 1; i < a.length; i++) {
            if (a[i].longValue() > max)
                max = a[i].longValue();
        }
        return max;
    }

    private void validateInput() {
        for (int i = 0; i < a.length; i++) {
            if (a[i].longValue() < 0)
                throw new IllegalArgumentException("Radix sort supports only non-negative integers.");
        }
    }

    void countSort(long exp) {
        int size = a.length;
        int count[] = new int[10];
        T output[] = a.clone();

        for (int i = 0; i < size; i++) {
            int digit = (int) ((a[i].longValue() / exp) % 10);
            count[digit]++;
        }

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = size - 1; i >= 0; i--) {
            int digit = (int) ((a[i].longValue() / exp) % 10);
            output[count[digit] - 1] = a[i];
            count[digit]--;
        }

        for (int i = 0; i < size; i++)
            a[i] = output[i];
    }

    void radixSort() {
        if (a == null || a.length == 0)
            return;

        validateInput();
        long max = this.getMax();

        for (long exp = 1; max / exp > 0; exp *= 10)
            this.countSort(exp);
    }
}

public class P10_RadixSort {
    public static void main(String[] args) {
        Integer i[] = { 59, 44, 79, 74, 88 };

        GenericRadixSort<Integer> arrayInt = new GenericRadixSort<Integer>(i);
        System.out.print("Array Before Sorting : ");
        arrayInt.printData();

        arrayInt.radixSort();

        System.out.print("Sorted Array is : ");
        arrayInt.printData();
        System.out.println();
    }
}
