import java.util.ArrayList;

public class _01_NPTELArrayListDemo {
    // NPTEL Example 13.1
    public static void main(String args[]) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println(a);

        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        System.out.println(animals);

        ArrayList<Integer> numbers = new ArrayList<Integer>(a); // another arraylist passed as input.
        numbers.add(13);
        numbers.add(17);
        System.out.println(a);
        System.out.println(numbers); // with 13 and 17 added

        /*
         * Similarly We can make an Object list.
         * ArrayList<Person> pList = new ArrayList<Person>(5);
         * pList.add(new Person("Ram", 25));
         * Person p2 = new Person("Sita", 22);
         * pList.add(p2);
         * pList.forEach(i -> somePrintMethod()); //take note of this
         */

        /*
         * Other methods:
         * numbers.addAll(5, any); //insert all with index
         * numbers.add(0,0); //insert element with index
         * numbers.addAll(even1); //insertion of all the elements (collection) at the
         * end of another list.
         */
    }
}
