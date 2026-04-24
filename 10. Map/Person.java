import java.util.*;

class Person {
    String firstName;
    String lastName;
    Integer age;

    Person(String f, String l, Integer a) {
        firstName = f;
        lastName = l;
        age = a;
    }

    public int hashCode() {
        return (5 * firstName.hashCode() + 7 * lastName.hashCode() + 11 * age.hashCode());
    }

public static void main(String args[])
{
    Person p = new Person("Rajat", "Ray", 21);
    Integer k = p.hashCode();
    System.out.println(p + "has code" + k);
}
}