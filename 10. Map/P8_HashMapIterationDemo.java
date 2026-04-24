// Example 38.8: Map iteration

/* This program illustrates the above here ways f iterating over a map container */

import java.util.*;

class P8_HashMapIterationDemo {
    public static void main(String args[]) {
        // Create a hash map object as a container.
        Map<String, String> mapCountryCodes = new HashMap<>();
        mapCountryCodes.put("1", "USA");
        mapCountryCodes.put("44", "United Kingdom");
        mapCountryCodes.put("33", "France");
        mapCountryCodes.put("81", "Japan");
        mapCountryCodes.put("91", "India");

        // Collection view using keySet()
        Set<String> setCodes = mapCountryCodes.keySet();
        Iterator<String> iterator = setCodes.iterator();
        while (iterator.hasNext()) {
            String code = iterator.next();
            String country = mapCountryCodes.get(code);
            System.out.println(code + " => " + country);
        }

        // Collection view using values()
        Collection<String> countries = mapCountryCodes.values();
        for (String country : countries) {
            System.out.println(country);
        }
        
        // Collection view using entrySet()
        Set<Map.Entry<String, String>> entries = mapCountryCodes.entrySet();
        System.out.println("Entries: :" + entries);
        for (Map.Entry<String, String> entry : entries) {
            String code = entry.getKey();
            String country = entry.getValue();
            System.out.println(code + " => " + country);
        }

        // Collection view using Lambda expression
        mapCountryCodes.forEach((code, country) -> System.out.println(code + " => " + country));
    }
}