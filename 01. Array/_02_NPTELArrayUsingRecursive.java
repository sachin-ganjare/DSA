import java.util.Arrays;
// NPTEL Program 12.6: Arrays -> Generic Compilation.

public class _02_NPTELArrayUsingRecursive<T> {
    private T[] x; // array of generic type T

    public _02_NPTELArrayUsingRecursive(T[] t) {
        x = t;
    }

    public void reverse1D(int length) {
        reverseHelper(0, length - 1);
    }

    private void reverseHelper(int start, int end) {
        if (start < end) {
            T temp = x[start];
            x[start] = x[end];
            x[end] = temp;
            reverseHelper(start + 1, end - 1); // recurse inward
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(x);
    }

    public static void main(String args[]) {
        // Case 1: Integer array
        Integer[] intArr = { 1, 2, 3, 4, 5, 6 };
        _02_NPTELArrayUsingRecursive<Integer> intA = new _02_NPTELArrayUsingRecursive<>(intArr);
        intA.reverse1D(intArr.length);
        System.out.println(intA); 

        // Case 2: String array
        String[] strArr = { "A", "E", "I", "O", "U" };
        _02_NPTELArrayUsingRecursive<String> stringA = new _02_NPTELArrayUsingRecursive<>(strArr);
        stringA.reverse1D(strArr.length);
        System.out.println(stringA); 
    }
}
