import java.util.*;
// Example 38.2: Adding object with duplicate values

class P7_HashMapDuplicateDemo {
    public static void main(String args[]) {
        // Create a hash map object as a container.
        HashMap<Integer, String> hMap = new HashMap<Integer, String>();
        // Put elements to the map container with duplicates
        hMap.put(200, "OK");
        hMap.put(303, "See Other");
        hMap.put(404, "Not Found");
        hMap.put(500, "Internal Server Error");
        hMap.put(303, "Invalid entry"); // will overwrite/update the value.
        hMap.put(101, "See Other");
        System.out.println(hMap); // Printing the container
    }
}