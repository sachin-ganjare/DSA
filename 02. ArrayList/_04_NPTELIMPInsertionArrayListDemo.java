import java.util.ArrayList;
// Example 13.4: Insertion into an ArrayList collection
public class _04_NPTELIMPInsertionArrayListDemo {
public static void main(String[] args) {
ArrayList<Integer> odd = new ArrayList<>(); 
odd.add(1);
odd.add(3);
odd.add(5);
odd.add(7);
odd.add(9);
System.out.println(odd);

ArrayList<Integer> numbers = new ArrayList<Integer>(odd);
System.out.println(numbers); 

ArrayList<Integer> even1 = new ArrayList<Integer>();
even1.add(2); //insertion of an element at the end.
even1.add(4);
even1.add(6);
System.out.println(even1); 

numbers.addAll(even1); //insertion of all the elements (collection) at the end of another list.
System.out.println(numbers); //inserted all at the end.

ArrayList<Integer> any = new ArrayList<Integer>();
any.add(8);
any.add(11);
any.add(13);
System.out.println(any);

System.out.println(numbers);
numbers.addAll(5, any); //insert all with index
numbers.add(0,0); //insert element with index
System.out.println(numbers);
}
}