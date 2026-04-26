public class P7_ConcatTest {
    private static final int ITERATIONS = 10_000;

    private static String concatWithString() {
        String text = "Java";
        for (int i = 0; i < ITERATIONS; i++) {
            text = text.concat("NPTEL"); // every concatenation creates a new object.
        }
        return text;
    }

    private static String concatWithStringBuffer() {
        StringBuffer buffer = new StringBuffer("Java");
        for (int i = 0; i < ITERATIONS; i++) {
            buffer.append("NPTEL"); // same object can keep growing (mutable.)
        }
        return buffer.toString();
    }


    public static void main(String[] args) {

        System.out.println("Concatenation performance demo");

        // String is immutable, so every concatenation creates a new object.
        long startTime = System.currentTimeMillis();
        String stringResult = concatWithString();
        System.out.println("Final length using String      : " + stringResult.length());
        long stringTime = System.currentTimeMillis() - startTime;
        System.out.println("Time taken using String        : " + stringTime + " ms");

        // StringBuffer is mutable, so the same object can keep growing.
        startTime = System.currentTimeMillis();
        String bufferResult = concatWithStringBuffer();
        System.out.println("Final length using StringBuffer: " + bufferResult.length());
        long bufferTime = System.currentTimeMillis() - startTime;
        System.out.println("Time taken using StringBuffer  : " + bufferTime + " ms");

        // Length and Capacity of StringBuffer
        StringBuffer buffer = new StringBuffer("Hello");
        System.out.println("\nStringBuffer length vs capacity");
        System.out.println("Buffer   : " + buffer);
        System.out.println("Length   : " + buffer.length());
        System.out.println("Capacity : " + buffer.capacity());

        // setCharAt() and setLength() Methods
        buffer = new StringBuffer("Hello");
        System.out.println("\nChanging characters in StringBuffer");
        System.out.println("Before   : " + buffer);
        System.out.println("charAt(1): " + buffer.charAt(1));
        buffer.setCharAt(1, 'i');
        buffer.setLength(2);
        System.out.println("After    : " + buffer);
        System.out.println("charAt(1): " + buffer.charAt(1));


        // HASHCODE BEHAVIOR
        String text = "Java";
        System.out.println("\nHash code behavior");
        System.out.println("String before change      : " + text.hashCode());
        text = text + "NPTEL";
        System.out.println("String after change       : " + text.hashCode());
        buffer = new StringBuffer("Java");
        System.out.println("StringBuffer before append: " + buffer.hashCode());
        buffer.append("NPTEL");
        System.out.println("StringBuffer after append : " + buffer.hashCode());
    }
}
