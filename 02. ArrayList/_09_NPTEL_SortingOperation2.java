import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Example 13.9: Sorting an ArrayList collection
public class _09_NPTEL_SortingOperation2 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("Preeti");
        names.add("Jay");
        names.add("Soma");
        System.out.println("Names : " + names);
        // Sort an ArrayList using its sort() method.
        // You must pass a Comparator to the ArrayList.sort() method.
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });
        System.out.println("Sorted Names : " + names);
    }
}