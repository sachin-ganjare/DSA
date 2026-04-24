// Example 38.4: Retrieving objects from a Map container

import java.util.*;

class P3_HashMapAccessDemo {
    public static void main(String args[]) {
        // Create a hash map object as a container.
        Map<String, Double> hMap = new HashMap<>();
        // Put elements to the map container
        hMap.put("John Doe", new Double(3434.34));
        hMap.put("Tom Smith", new Double(123.22));
        hMap.put("Jane Baker", new Double(1378.00));
        hMap.put("Tod Hall", new Double(99.22));
        hMap.put("Ralph Smith", new Double(-19.08));
        // Deposit 1000 into John Doe's account.
        double balance = hMap.get("John Doe");
        hMap.put("John Doe", balance + 1000);
        System.out.println(hMap); // existing key updated
        System.out.println("John Doe's current balance: " + hMap.get("John Doe"));
    }
}