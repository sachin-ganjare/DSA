import java.util.*;
// NPTEL example 13.2
public class _02_NPTELCreateArrayListFromCollectionExample {
public static void main(String[] args) {

ArrayList<Integer> aList = new ArrayList<Integer>(); 
aList.add(2);
aList.add(3);
aList.add(5);
aList.add(7);
aList.add(11);
ArrayList<Integer> numbers = new ArrayList<Integer>(aList); //another arraylist passed as input.
numbers.add(13); 
numbers.add(17);
System.out.println(aList); 
System.out.println(numbers); //with 13 and 17 added
}
}
