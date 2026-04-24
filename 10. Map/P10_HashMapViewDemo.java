
// Example 38.7: Accessing the status of a map
import java.util.HashMap;

/* There are two methods, namely size() and isEmpty() that can be used to
check the status of a map container. The following example illustrates how
an object stored in a map framework can be viewed. */

class P10_HashMapViewDemo {
    public static void main(String args[]) {
        // Create a hash map object as a container.
        HashMap<Integer, String> hMap = new HashMap<Integer, String>();
        
        // Put elements to the map container
        hMap.put(200, "OK");
        hMap.put(303, "See Other");
        hMap.put(404, "Not Found");
        hMap.put(500, "Internal Server Error");
        
        // Checking the container
        if (hMap.isEmpty()) {
            System.out.println("Error: The container is empty");
        } else {
            System.out.println(hMap); // Printing the container
        }

        // Printing the size of the container
        System.out.println("Size : " + hMap.size());
    }
}