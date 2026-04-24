import java.util.*;
// 41.4 Traversing a set using Iterator
public class P3_HashSetTraversalDemo {
    public static void main(String[] args) {
        Set<String> pLangs = new HashSet<>();
        pLangs.add("C");
        pLangs.add("C++");
        pLangs.add("Java");
        pLangs.add("Python");
        pLangs.add("PHP");
        pLangs.add("R");
        // Using simple for-each loop
        for (String pl : pLangs) {
            System.out.println(pl);
        }

        // Using iterator()
        Iterator<String> iter = pLangs.iterator();
        while (iter.hasNext()) {
            String pl = iter.next();
            System.out.println(pl);
        }
        // Using forEach and lambda expression
        pLangs.forEach(pLang -> {
            System.out.println(pLang);
        });
        // Using iterator() and forEachRemaining() method
        iter = pLangs.iterator();
        iter.forEachRemaining(pLang -> {
            System.out.println(pLang);
        });
    }
}
