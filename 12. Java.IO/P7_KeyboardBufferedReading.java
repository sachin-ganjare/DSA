
// Example 44.1: Reading String, Integer and Double from Keyboard
import java.io.*;

public class P7_KeyboardBufferedReading {
    public static void main(String args[]) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String: ");
        String str1 = b.readLine();
        System.out.println("Entered String value is: " + str1);
        System.out.println("Enter a whole number: ");
        String str2 = b.readLine();
        int x = Integer.parseInt(str2);
        System.out.println("Enter a double value: ");
        String str3 = b.readLine();
        double y = Double.parseDouble(str3);
        if (x > y)
            System.out.println("First number " + x + " is greater than second number " + y);
        else
            System.out.println("First number " + x + " is less than second number " + y);
        b.close();
    }
}