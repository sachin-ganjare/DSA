import java.util.*;

class P11_LinkedHashMapDemo {
    private static final int MAX = 6; // Refers to the max size of the map

    public static void main(String args[]) {
        // Creating the linked hashmap and implementing removeEldestEntry() to MAX size
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>() {
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > MAX;
            }
        };
        // Adding elements using put()
        lhm.put(0, "Welcome");
        lhm.put(1, "To");
        lhm.put(2, "The");
        lhm.put(3, "World");
        lhm.put(4, "Of");
        lhm.put(5, "Java");
        System.out.println("" + lhm);
        // Adding more elements
        lhm.put(6, "Joy with Java");
        // Displying the map after adding one more element
        System.out.println("" + lhm);
        // Adding more elements
        lhm.put(7, "Hello");
        // Displying the map after adding one more element
        System.out.println("" + lhm);
    }
}
