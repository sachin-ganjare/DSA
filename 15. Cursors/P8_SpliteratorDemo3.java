// Use tryAdvance() to display(action) contents of arraylist.
// Notice how lambda expression is used to implement accept method
// of Consumer interface
// Example 60.10 : Simple Spliterator using tryAdvance() method

import java.util.ArrayList;
import java.util.Spliterator;

public class P8_SpliteratorDemo3 {
    public static void main(String[] args) {

        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(1);
        al1.add(2);
        al1.add(-3);
        al1.add(-4);
        al1.add(5);

        // Use tryAdvance() to display(action) contents of arraylist.
        System.out.print("Contents of arraylist:\n");
        Spliterator<Integer> splitr = al1.spliterator();
        while (splitr.tryAdvance((n) -> System.out.println(n)));

        // Use tryAdvance() for getting absolute values(action) of contents
        ArrayList<Integer> al2 = new ArrayList<>();
        splitr = al1.spliterator();
        // Notice how lambda expression is used to implement accept method of Consumer interface
        while (splitr.tryAdvance((n) -> al2.add(Math.abs(n)))) ;

        System.out.print("Absolute values of contents of arraylist:\n");
        // getting Spliterator object on al2
        splitr = al2.spliterator();
        while (splitr.tryAdvance((n) -> System.out.println(n))) ;
    }
}