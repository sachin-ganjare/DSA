class InterpolationSearch<T extends Number & Comparable<T>> {
    private final T[] a;

    InterpolationSearch(T[] x) {
        this.a = x;
    }

    T getData(int i) {
        return a[i];
    }

    void printData() {
        for (T value : a) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    int interpolationSearch(T key) {
        int lowerIndex = 0;
        int upperIndex = a.length - 1;

    // Continue while key lies within current bounds
        while (lowerIndex <= upperIndex &&
               key.compareTo(a[lowerIndex]) >= 0 &&
               key.compareTo(a[upperIndex]) <= 0) {

            if (lowerIndex == upperIndex) {
                return (a[lowerIndex].compareTo(key) == 0) ? lowerIndex : -1;
            }

            double lowVal = a[lowerIndex].doubleValue();
            double highVal = a[upperIndex].doubleValue();
            double keyVal = key.doubleValue();

            double denominator = highVal - lowVal;
            if (denominator == 0.0) {
                return (a[lowerIndex].compareTo(key) == 0) ? lowerIndex : -1;
            }

            // pos = low + (key - arr[low] * (high - low))/(arr[high] - arr[low])
            int probableIndex = lowerIndex +
                    (int) ((keyVal - lowVal) * (upperIndex - lowerIndex) / denominator);

            // Clamp to valid range
            if (probableIndex < lowerIndex) probableIndex = lowerIndex;
            if (probableIndex > upperIndex) probableIndex = upperIndex;

            int cmp = key.compareTo(a[probableIndex]);

            if (cmp < 0) {
                upperIndex = probableIndex - 1;
            } else if (cmp > 0) {
                lowerIndex = probableIndex + 1;
            } else {
                return probableIndex;
            }
        }
        return -1;
    }
}

public class P3_InterpolationSearchDemo {
    public static void main(String[] args) {

        // Searching with Integers
        Integer i[] = { 10, 20, 30, 40, 50 };
        InterpolationSearch<Integer> arrayInt = new InterpolationSearch<Integer>(i);
        arrayInt.printData();
        int searchInt = 20;
        int pos = arrayInt.interpolationSearch(searchInt);
        if (pos == -1)
            System.out.println(searchInt + " not found in the array");
        else
            System.out.println(searchInt + " found at position " + pos);
        System.out.println();

        // Searching with Double
        Double d[] = { 10.5, 20.5, 30.5, 40.5, 50.5 };
        InterpolationSearch<Double> arrayDouble = new InterpolationSearch<Double>(d);
        arrayDouble.printData();
        Double searchDouble = 30.5;
        pos = arrayDouble.interpolationSearch(searchDouble);
        if (pos == -1)
            System.out.println(searchDouble + " not found in the array");
        else
            System.out.println(searchDouble + " found at position " + pos);
        System.out.println();

        // Searching with byte values
        Byte b[] = { 10, 20, 30, 40, 50 };
        InterpolationSearch<Byte> arrayByte = new InterpolationSearch<Byte>(b);
        arrayByte.printData();
        Byte searchByte = 50;
        pos = arrayByte.interpolationSearch(searchByte);
        if (pos == -1)
            System.out.println(searchByte + " not found in the array");
        else
            System.out.println(searchByte + " found at position " + pos);
        System.out.println();
    } 
} 
