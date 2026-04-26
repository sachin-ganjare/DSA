class GenericArraySorting<T extends Comparable<T>> {
    T a[];

    GenericArraySorting(T x[]) { // Define a constructor
        a = x;
    }

    T getData(int i) { 
        return a[i];
    }

    void printData() {
        for (int i = 0; i < a.length; i++)
            System.out.print(this.getData(i) + " "); // Print the i-th element
        System.out.println();
    }

    void bubbleSort() {
        T temp;
        boolean swapped = true;
        for (int i = 0; i < this.a.length - 1 && swapped; i++) {
            swapped = false;
            for (int j = 0; j < this.a.length - i - 1; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    } 
} 

public class P8_BubbleSort {
    public static void main(String[] args) {
        Integer i[] = { 59, 44, 79, 74, 88 };
       
        GenericArraySorting<Integer> arrayInt = new GenericArraySorting<Integer>(i);
        System.out.print("Array Before Sorting : ");
        arrayInt.printData();
      
        arrayInt.bubbleSort(); 
       
        System.out.print("Sorted Array is : ");
        arrayInt.printData();
        System.out.println();
    }
} 
