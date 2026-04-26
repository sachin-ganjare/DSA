import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class P5_JavaCurorsTest {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < 10; i++) {
            v.add(i);
        }

        System.out.println("Original vector: " + v);

        // Create three iterators
        Enumeration<Integer> e = v.elements();
        Iterator<Integer> itr = v.iterator();

        System.out.print("Enumeration output: ");
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }
        System.out.println();

        System.out.print("Iterator removing odd elements: ");
        while (itr.hasNext()) {
            int value = itr.next();
            System.out.print(value + " ");
            if (value % 2 != 0) {
                itr.remove();
            }
        }
        System.out.println();
        System.out.println("Vector after Iterator: " + v);

        ListIterator<Integer> ltr = v.listIterator(); // you should not declare before other iterator modifications
        System.out.print("ListIterator traversal: ");
        while (ltr.hasNext()) {
            int value = ltr.next();
            System.out.print(value + " ");
            ltr.set(value * 10);
        }
        System.out.println();
        System.out.println("Vector after ListIterator set(): " + v);

        System.out.print("ListIterator reverse traversal: ");
        while (ltr.hasPrevious()) {
            System.out.print(ltr.previous() + " ");
        }
        System.out.println();
    }
}
