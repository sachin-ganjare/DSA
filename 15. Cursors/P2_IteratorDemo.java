import java.util.*;

public class P2_IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            al.add(i);
        System.out.println(al);
        
        Iterator<Integer> itr = al.iterator();
        // The cursor at the beginning of the first element
        while (itr.hasNext()) { // Iterate over each element in al
            int i = itr.next(); // Read the current element
            System.out.print(i + " ");
            if (i % 2 != 0)
                itr.remove(); // Removing odd elements
        }
        System.out.println();
        System.out.println(al);
    }
}