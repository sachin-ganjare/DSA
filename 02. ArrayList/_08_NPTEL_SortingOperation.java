import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// Example 13.8: Sorting an ArrayList collection
public class _08_NPTEL_SortingOperation {

public static void main(String[] args) {
List<Integer> numbers = new ArrayList<Integer>();
numbers.add(13);
numbers.add(7);
numbers.add(18);
numbers.add(5);
numbers.add(2);
System.out.println("Before : " + numbers);
// Sorting an ArrayList using Collections.sort() method
Collections.sort(numbers);
System.out.println("After : " + numbers);
}
}