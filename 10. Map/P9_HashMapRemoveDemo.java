import java.util.*;

class P9_HashMapRemoveDemo {
    public static void main(String args[]) {
        // Create a hash map object as a container.
        Map<String, Double> hMap = new HashMap<>();
        // Put elements to the map container
        hMap.put("John Doe", new Double(3434.34));
        hMap.put("Tom Smith", new Double(123.22));
        hMap.put("Jane Baker", new Double(1378.00));
        hMap.put("Tod Hall", new Double(99.22));
        hMap.put("Ralph Smith", new Double(-19.08));
        Double val = hMap.remove("Jane Baker");
        if (val != null) {
            System.out.println("Removed value: " + val);
        }
        System.out.println(hMap);
        hMap.remove("Tod Hall", 99.22);
        System.out.println(hMap);
        hMap.replace("Ralph Smith", 545.67);
        System.out.println(hMap);
    }
}