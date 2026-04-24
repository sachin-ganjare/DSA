import java.util.ArrayList;
import java.util.function.Predicate;

//Example 13.6: Deletion from an ArrayList collection
public class _06_NPTELIMPDeletionOperation {
    public static void main(String[] args) {

        ArrayList<String> langs = new ArrayList<String>();
        langs.add("C");
        langs.add("C++");
        langs.add("Java");
        langs.add("Python");
        langs.add("R");
        langs.add("Spark");
        System.out.println("Initial List: " + langs);
        

        langs.remove(5); //removed index 5th value
        System.out.println("After remove(5): " + langs);

        boolean status = langs.remove("Smalltalk"); //removes FIRST occurence
        System.out.println("Smalltalk is removed : " + status);

        
        ArrayList<String> script = new ArrayList<String>();
        script.add("SQL");
        script.add("Python");
        script.add("Javascript");
        langs.removeAll(script); // remove all elements that exist in script (intersection removal)
        System.out.println("After script removal: " + langs);

        // conditional removal
        langs.removeIf(
                new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.startsWith("C");
                    }
                });
        /*
         * The above removeIf() call can also be written using lambda expression like
         * this :
         * langs.removeIf(i -> i.startsWith("C"));
         */
        System.out.println("After Removing all elements that start with \"C\": " + langs);

        langs.clear(); // clears existing list.
        System.out.println("List is empty? " + langs.isEmpty());
    }
}