import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// Example 13.11: Traversing an ArrayList collection
public class _11_NPTEL_TraversingArrayList {
    public static void main(String[] args) {

        ArrayList<String> tvShows = new ArrayList<String>();
        tvShows.add("Nimki Mukhiya");
        tvShows.add("Game of Thrones");
        tvShows.add("Mahabharat");
        tvShows.add("Balika Badhu");
        System.out.println("Traversing using forEach() and lambda \n"); //way 1
        tvShows.forEach( i -> {
            System.out.println(i);
        });

        System.out.println("\n=== Iterate using an iterator() ==="); //way 2
        Iterator<String> tvShowIterator = tvShows.iterator(); //iterator1
        while (tvShowIterator.hasNext()) {
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }
        System.out.println("Traversing usingiterator() and forEachRemaining()"); //way 3
        tvShowIterator = tvShows.iterator(); //iterator2
        tvShowIterator.forEachRemaining(tvShow -> {
            System.out.println(tvShow);
        });

        System.out.println("Traversing using a listIterator() \n"); //way 4
        
        // Here, we start from the end of the list and traverse backwards.
        ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
        while (tvShowListIterator.hasPrevious()) {
            String tvShow = tvShowListIterator.previous();
            System.out.println(tvShow);
        }
        System.out.println("\n=== Iterate using simple for-each loop ==="); //way 5
        for (String tvShow : tvShows) {
            System.out.println(tvShow);
        }
        System.out.println("\n=== Iterate using for loop with index ==="); //way 6
        for (int i = 0; i < tvShows.size(); i++) {
            System.out.println(tvShows.get(i));
        }
    }
}