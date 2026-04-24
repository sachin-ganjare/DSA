import java.util.*;

class P5_CollectionsSychronizedMapHashMap {
    public static void main(String args[]) {
        // Create two map object containers.
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
        // Creatin a map
        map.put(400, "Bad Request");
        map.put(304, "Not Modified");
        map.put(200, "OK");
        map.put(301, "Moved Permanently");
        map.put(500, "Internal Server Error");
        Set<Integer> keySet = map.keySet();  // keyset extraction
        synchronized (map) {
            Iterator<Integer> iterator = keySet.iterator();
            while (iterator.hasNext()) {
                Integer key = iterator.next();
                String value = map.get(key);
                System.out.println("Key: " + key + " Value: "+ value);
            }
        }
    }
}