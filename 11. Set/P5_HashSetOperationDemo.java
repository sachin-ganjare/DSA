import java.util.*;
// Example 41.6: Basic set theory operation

class P5_HashSetOperationDemo {
    public static void main(String args[]) {

        // Create a hash set.
        Set<Integer> s1 = new HashSet<>(Arrays.asList(20, 56, 89, 31, 8, 5));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(8, 89));

        // Sub set operation
        if (s1.containsAll(s2)) {
            System.out.println("s2 is a subset of s1");
        }

        // Union operation
        Set<Integer> s3 = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9));
        Set<Integer> s4 = new HashSet<>(Arrays.asList(2, 4, 6, 8));
        System.out.println("s3 before union: " + s3);
        s3.addAll(s4);
        System.out.println("s3 after union: " + s3);

        // Intersection operation
        Set<Integer> s5 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 9));
        Set<Integer> s6 = new HashSet<>(Arrays.asList(2, 4, 6, 8));
        System.out.println("s5 before intersection: " + s5);
        s5.retainAll(s6);
        System.out.println("s5 after intersection: " + s5);
        
        // Set difference operation
        Set<Integer> s7 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 9));
        Set<Integer> s8 = new HashSet<>(Arrays.asList(2, 4, 6, 8));
        System.out.println("s7 before difference: " + s7);
        s7.removeAll(s8);
        System.out.println("s7 after difference: " + s7);
    }
}