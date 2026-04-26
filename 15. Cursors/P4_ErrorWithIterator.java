import java.util.*;

public class P4_ErrorWithIterator {
    public static void main(String args[]) {
        ArrayList<String> books = new ArrayList<String>();
        books.add("C");
        books.add("C++");
        books.add("Java");
        
        for (String obj : books) {
            System.out.println(obj);
            // We are adding element while iterating list
            books.add("C++");
        }

        Iterator<String> itr = books.iterator();
        while (itr.hasNext()) {
            String b = itr.next();
            System.out.print(b + " ");
            books.add("Python"); // You cannot do it!
            books.remove("C"); // You cannot do it!!
        }
        System.out.println(books);
    }
}