import java.util.*;
// Example 41.5: Traversing a set using for and Lambda-expression

class P4_HashSetTraversalDemo {
    public static void main(String args[]) {
        // Create a hash set.
        Set<String> names = new HashSet<>();
        names.add("Tom");
        names.add("Mary");
        names.add("Tom");
        names.add("John");
        names.add("Tom");
        names.add("Bob");
        names.add("Alice");
        // Using a for loop
        for (String name : names) {
            System.out.println(name);
        }
        // Uisng for each method along with Lambda expression
        names.forEach(System.out::println);
    }
}