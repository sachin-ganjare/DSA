
// Java program to demonstrate Enumeration
import java.util.Enumeration;
import java.util.Vector;

public class P1_EnumerationTest {
    public static void main(String[] args) {
        // Create a vector and print its contents
        Vector<Integer> v = new Vector<Integer>();
        for (int i = 0; i < 10; i++)
            v.addElement(i);
        System.out.println(v);
        /*
         * Declare an enumerator to the collection v At the beginning e points to
         * index just before the first element in v
         */
        Enumeration<Integer> e = v.elements();
        while (e.hasMoreElements()) { // Enumerate each element one-by-one
            int i = (Integer) e.nextElement(); // Moving cursor to next element
            System.out.print(i + " "); // Print the current element
        }
    }
}
