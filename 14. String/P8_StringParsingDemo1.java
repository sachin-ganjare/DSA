// Demonstrate String parsing using StringTokenizer
// StringTokenizer splits a string into tokens based on delimiters

import java.util.StringTokenizer;

class P8_StringParsingDemo1 {
    public static void main(String args[]) {
        
        // ============================================
        // Example 1: Simple tokenization (space delimiter)
        // ============================================
        System.out.println("=== Example 1: Simple Tokenization ===");
        StringTokenizer st1 = new StringTokenizer("Joy with Java", " ");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());  // mutable
        }
        
        // ============================================
        // Example 2: Multiple delimiters (= and ;)
        // Parsing key=value pairs from a string
        // ============================================
        System.out.println("\n=== Example 2: Parsing Key-Value Pairs ===");
        String in = "title=Java: Data Structures;" +
                    "author=DS;" + 
                    "publisher=NPTEL;" + 
                    "copyright=2020;";
        
        // Delimiters: "=;" means split on both = and ;
        StringTokenizer st2 = new StringTokenizer(in, "=;");
        
        while (st2.hasMoreTokens()) {
            String key = st2.nextToken();    // e.g., "title"
            String val = st2.nextToken();    // e.g., "Java: Data Structures"
            System.out.println(key + "\t\t" + val);
        }
        
        // ============================================
        // Example 3: Using String.split() method
        // Alternative approach without StringTokenizer
        // ============================================
        System.out.println("\n=== Example 3: Using String.split() ===");
        String text = "apple,banana,cherry,date";
        String[] fruits = text.split(",");  //immutable
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}