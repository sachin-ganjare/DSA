
// Example 13.3: Creating an ArrayList object with user defined objects

import java.util.ArrayList;

public class _03_NPTELArrayListUserDefinedObjectDemo {
    public static void main(String[] args) {

        ArrayList<Person> pList = new ArrayList<Person>(5);
        pList.add(new Person("Ram", 25));
        Person p2 = new Person("Sita", 22); 
        pList.add(p2); 
        pList.add(new Person("John", 34));
        pList.add(p2); // Duplicate entry is allowed
        pList.add(new Person("Rahim", 29)); 
        pList.add(new Person("Lilly", 24));
   
        pList.forEach(i -> i.printData()); //take note of this
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printData() {
        System.out.println(name + " " + age);
    }
}