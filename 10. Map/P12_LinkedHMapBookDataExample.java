// Example 39.3: Map container with user defined data type

/* This example illustrates how a map container will be with objects of Book
class. */
import java.util.*;

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String n, String a, String p, int q) {
        this.id = id;
        name = n;
        author = a;
        publisher = p;
        quantity = q;
    }
}

// Continued on ...
public class P12_LinkedHMapBookDataExample {
    public static void main(String[] args) {
        // Creating map of Books
        Map<Integer, Book> map = new LinkedHashMap<Integer, Book>();
        // Creating Books
        Book b1 = new Book(101, "Python", "Ponting", "Oxford", 8);
        Book b2 = new Book(102, "Java", "Spielberg", "McGraw Hill", 4);
        Book b3 = new Book(103, "C++", "Galvin", "Wiley", 6);
        // Adding Books to map
        map.put(2, b2);
        map.put(1, b1);
        map.put(3, b3);
        // Traversing map
        for (Map.Entry<Integer, Book> entry : map.entrySet()) {
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
