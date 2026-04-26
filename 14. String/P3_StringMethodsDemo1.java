// Example 56.3: String demo program

class P3_StringMethodsDemo1 {
    public static void main(String args[]) {
        String text = "Data Structure with Java";
        String spacedText = "  Data Structure with Java  ";
        String wordsText = "  Data   Structure with   Java  ";
        String languageText = "Data Structure with C++";
        String s1 = "NPTEL";
        String s2 = new String("Course");
        String[] words = wordsText.trim().split("\\s+");

        System.out.println("Original string: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Character at index 4: " + text.charAt(4));
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Trimmed string: " + spacedText.trim()); // removes extra spaces from begining and end of a string
        System.out.println("After replace: " + languageText.replace("C++", "Java"));
        System.out.println("Concatenated string: " + s1 + " " + s2);
        System.out.println("Words after trim and split:");
        for (int i = 0; i < words.length; i++) {
            System.out.println("words[" + i + "] = " + words[i]);
        }
    }
}
