
// Example 41.9: Sub set of a TreeSet collection
/* Because TreeSet implements the NavigableSet interface, you can use the methods defined by
NavigableSet to retrieve elements of a TreeSet. You can write many programs performing several
operations with the method declared in NavigableSet. In the following, the application of
subSet() is illustrated. The subSet() method returns a sub set of a tree set that contains the
elements between elements, say e1 (inclusive) and e2 (exclusive).
*/
import java.util.*;

class P10_TreeSetSubSet {
public static void main(String args[]) {
    // Create a tree set.
    TreeSet<String>ts = new TreeSet<String>();
    // Add elements to the tree set.
    ts.add("D");
    ts.add("E");
    ts.add("B");
    ts.add("A");
    ts.add("S");
    ts.add("I");
    ts.add("S");
    System.out.println(ts.subSet("D", "S"));
}
}