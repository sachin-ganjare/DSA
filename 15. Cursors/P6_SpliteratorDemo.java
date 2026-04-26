import java.util.*;
import java.util.stream.Stream;

public class P6_SpliteratorDemo {
    public static void main(String[] args) {
        // Create an array list for doubles.
        ArrayList<Integer> al = new ArrayList<>();
        // Add values to the array list.
        al.add(1);
        al.add(2);
        al.add(-3);
        al.add(-4);
        al.add(5);

        // Obtain a Stream to the array list.
        Stream<Integer> str = al.stream();
        Spliterator<Integer> splitr1 = str.spliterator();
        System.out.println("estimate size : " + splitr1.estimateSize());
        System.out.println("exact size : " + splitr1.getExactSizeIfKnown());
        System.out.println(splitr1.hasCharacteristics(splitr1.characteristics()));

        System.out.println("Traversing via Spliterator's ForEachRemaining Method :");
        splitr1.forEachRemaining((n) -> System.out.println(n));

        // Another Stream and the spliterator() method..
        splitr1 = al.stream().spliterator();
        // Spliterator 2 Splits the Spliterator.
        Spliterator<Integer> splitr2 = splitr1.trySplit();
        if (splitr2 != null) { // If Split is not empty -> Print
            System.out.println("Output from splitr2: ");
            splitr2.forEachRemaining((n) -> System.out.println(n));
        }

        System.out.println("\nOutput from splitr1: ");
        splitr1.forEachRemaining((n) -> System.out.println(n));
    }
}
