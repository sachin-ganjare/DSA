import java.util.*;

// Demonstrating PECS Rule: Producer Extends, Consumer Super
public class P08_PECS_Demo {

    // Producer: ? extends Number (READ ONLY)
    // We can read numbers but cannot add to the list
    static double calculateTotal(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue(); // Safe: all are Numbers
        }

        // list.add(10); -- Not allowed (compile-time error)
        return sum;
    }

    // Consumer: ? super Integer (WRITE ONLY)
    // We can add Integers but cannot safely read as Integer
    static void addMarks(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);

        // Integer x = list.get(0); -- Not safe
        Object obj = list.get(0); // -- Only Object is safe
        System.out.println("First element (as Object): " + obj);
    }

    public static void main(String[] args) {

        // Producer Example
        List<Integer> intMarks = Arrays.asList(20, 30, 40);
        List<Double> doubleMarks = Arrays.asList(10.5, 20.5, 30.0);

        System.out.println("Total Integer Marks: " + calculateTotal(intMarks));
        System.out.println("Total Double Marks: " + calculateTotal(doubleMarks));

        // Consumer Example
        List<Number> numberList = new ArrayList<>();
        addMarks(numberList);

        System.out.println("After adding Integers: " + numberList);

        // Another valid consumer
        List<Object> objectList = new ArrayList<>();
        addMarks(objectList);

        System.out.println("After adding to Object list: " + objectList);
    }
}