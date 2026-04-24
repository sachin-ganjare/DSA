import java.util.*;

class P4_HashMapBulkOperationDemo {
    public static void main(String args[]) {
        // Create two map object containers.
        Map<Integer, String> countryCodesEU = new HashMap<>();
        countryCodesEU.put(44, "United Kingdom");
        countryCodesEU.put(33, "France");
        countryCodesEU.put(49, "Germany");
        Map<Integer, String> countryCodesWorld = new HashMap<>();
        countryCodesWorld.put(1, "United States");
        countryCodesWorld.put(86, "China");
        countryCodesWorld.put(82, "South Korea");
        System.out.println("Before: " + countryCodesWorld);
        // Merger two containers using putAll()
        countryCodesWorld.putAll(countryCodesEU);
        System.out.println("After: " + countryCodesWorld);
        // Clear one map container
        countryCodesEU.clear();
        System.out.println("Is map empty? " + countryCodesEU.isEmpty());
    }
}