// Example 38.3: Copying a Map into other

import java.util.*;

class P6_HashMapCopyDemo {
    public static void main(String args[]) {
        // Create a hash map object as a container.
        Map<String, Double> hMap1 = new HashMap<>();
        // Put elements to the map container
        hMap1.put("John Doe", new Double(3434.34));
        hMap1.put("Tom Smith", new Double(123.22));
        hMap1.put("Jane Baker", new Double(1378.00));
        hMap1.put("Tod Hall", new Double(99.22));
        hMap1.put("Ralph Smith", new Double(-19.08));
        System.out.println(hMap1); // Printing the container
        // Create a copy of a hMap1 to hMap2
        Map<String, Double> hMap2 = new HashMap<>(hMap1);
        // Add data into hMap2
        hMap1.put("Robin Keith", new Double(423.22));
        hMap2.put("Peter Hwang", new Double(178.00));
        System.out.println(hMap2); // Printing the container
    }
}
