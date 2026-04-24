
// Example 41.7: Difference between HashSet and LinkedHashSet
/* The following program illustrates the ordering of elements in two sets
created by Hashset and LinkedHashset classes. */
import java.util.*;

class P8_DifferentSetDemo {
    public static void main(String args[]) {
        // Create a hash set.
        HashSet<String> hs = new HashSet<String>();
        // Add elements to the hash set.
        hs.add("A");
        hs.add("B");
        hs.add("J");
        hs.add("D");
        hs.add("E");
        hs.add("F");
        System.out.println(hs);
        // Create a linked hash set.
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        // Add elements to the hash set.
        lhs.add("A");
        lhs.add("B");
        lhs.add("J");
        lhs.add("D");
        lhs.add("E");
        lhs.add("F");
        System.out.println(lhs);
    }
}