import java.util.*;

class P2_HashMapCreateDemo {
    public static void main(String args[]) {
        // Create a hash map object as a container.
        HashMap<Double, String> hMap = new HashMap<Double, String>();
        // Put elements to the map container
        hMap.put(200.0, "OK");
        hMap.put(303.0, "See Other");
        hMap.put(404.0, "Not Found");
        hMap.put(500.0, "Internal Server Error");
        System.out.println(hMap); // Printing the container
    }
}