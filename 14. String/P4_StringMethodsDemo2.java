public class P4_StringMethodsDemo2 {
    public static void main(String[] args) {
        String text1 = "DATA STRUCTURE WITH JAVA";
        String text2 = "DATA STRUCTURE WITH C++";
        String text3 = "DATA STRUCTURE WITH JAVA";
        String text4 = "data structure with c++";
        String text5 = "data structure with java";
        String text6 = new String("DATA STRUCTURE WITH JAVA");

        // == checks whether both references point to the same object in memory.
        /*
         * text1 == text3 will likely be true because both string literals are reused
         * from the string pool
         * text1 == text6 will be false because new String(...) creates a different
         * object
         * text1.equals(text6) will be true because the text content is the same
         */
        System.out.println("String comparison demo");
        System.out.println("text1 == text3: " + (text1 == text3));
        System.out.println("text1 == text6: " + (text1 == text6));

        // equals() checks whether both strings have the same content.
        System.out.println("text1.equals(text2): " + text1.equals(text2));
        System.out.println("text1.equals(text3): " + text1.equals(text3));
        System.out.println("text1.equals(text6): " + text1.equals(text6));
        System.out.println("text1.equalsIgnoreCase(text4): " + text1.equalsIgnoreCase(text4)); // ignores
                                                                                               // uppercase/lowercase
                                                                                               // difference
        System.out.println("text1.equalsIgnoreCase(text5): " + text1.equalsIgnoreCase(text5));

        // Compare strings alphabetically.
        /*
         * 0 if both strings are equal
         * a negative value if the first string comes before the second
         * a positive value if the first string comes after the second
         */
        System.out.println("\ncompareTo demo");
        System.out.println("text1.compareTo(text2): " + text1.compareTo(text2)); // compares character values from left
                                                                                 // to right
        System.out.println("text1.compareTo(text3): " + text1.compareTo(text3));
        System.out.println("text1.compareToIgnoreCase(text4): " + text1.compareToIgnoreCase(text4));
        System.out.println("text1.compareToIgnoreCase(text5): " + text1.compareToIgnoreCase(text5));

        // Extract part of a string and search inside it.
        System.out.println("\nSubstring and search demo");
        System.out.println("text1.substring(5): " + text1.substring(5));
        System.out.println("text1.substring(5, 14): " + text1.substring(5, 14));
        System.out.println("text1.indexOf(\"WITH\"): " + text1.indexOf("WITH"));
        System.out.println("text1.indexOf(\"T\", 4): " + text1.indexOf("T", 4));
        System.out.println("text1.lastIndexOf(\"T\"): " + text1.lastIndexOf("T"));

    }
}
