public class P6_StringBufferDemo {
    public static void main(String[] args) {
        // StringBuffer is mutable, so we can change the same object many times.
        StringBuffer text = new StringBuffer("Data Structure");

        System.out.println("Initial text: " + text);

        // append() adds text at the end.
        text.append(" with Java");
        System.out.println("After append: " + text);

        // insert() adds text at a specific position.
        text.insert(15, "course ");
        System.out.println("After insert: " + text);

        // replace() changes characters between start index and end index - 1.
        text.replace(20, 24, "C++");
        System.out.println("After replace: " + text);

        // delete() removes characters between start index and end index - 1.
        text.delete(15, 20);
        System.out.println("After delete: " + text);

        // reverse() reverses the current content.
        StringBuffer reversedText = new StringBuffer(text);
        reversedText.reverse();
        System.out.println("After reverse: " + reversedText);

        // Some commonly used constructors.
        StringBuffer emptyBuffer = new StringBuffer();
        StringBuffer copyBuffer = new StringBuffer(text);
        StringBuffer capacityBuffer = new StringBuffer(30);

        System.out.println("\nConstructor demo");
        System.out.println("Empty buffer: \"" + emptyBuffer + "\"");
        System.out.println("Copied buffer: " + copyBuffer);
        System.out.println("Capacity of capacityBuffer: " + capacityBuffer.capacity());
    }
}
