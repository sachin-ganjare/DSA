class Student {
    String name;
    int[] marks;

    Student(String s, int m1, int m2, int m3) {
        name = s;
        marks = new int[]{m1, m2, m3};
    }

    void printStudent() {
        System.out.println("Name: " + name);
        System.out.println("Scores: " + marks[0] + " " + marks[1] + " " + marks[2]);
    }
}

class GenericArrays<T, S> {
    T[] a;
    S[] b;

    GenericArrays(T[] x, S[] y) {
        a = x;
        b = y;
    }

    T getDataT(int i) {
        return a[i];
    }

    S getDataS(int i) {
        return b[i];
    }

    // Generic utility methods
    static <E> void printData(E[] arr) {
        for (E element : arr) {
            if (element instanceof P19_Student) {
                ((P19_Student) element).printStudent();
            } else {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    static <E> void reverseArray(E[] arr) {
        int front = 0, rear = arr.length - 1;
        while (front < rear) {
            E temp = arr[rear];
            arr[rear] = arr[front];
            arr[front] = temp;
            front++;
            rear--;
        }
    }
}

public class P05_NPTELMultiParameterOverloading {
    public static void main(String[] args) {

        String[] t = {"A", "B", "C"};

        P19_Student[] s = {
            new P19_Student("Ram", 86, 66, 96),
            new P19_Student("Rahim", 88, 99, 77),
            new P19_Student("John", 75, 85, 95)
        };

        GenericArrays<String, P19_Student> arrayData = new GenericArrays<>(t, s);

        // Print
        GenericArrays.printData(t);
        GenericArrays.printData(s);

        // Reverse
        GenericArrays.reverseArray(t);
        GenericArrays.reverseArray(s);

        System.out.println("\nAfter Reversing:");
        GenericArrays.printData(t);
        GenericArrays.printData(s);
    }
}