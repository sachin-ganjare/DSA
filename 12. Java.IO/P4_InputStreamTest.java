// Example 43.4: Using methods of the FileInputStream class

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// fins.available() acts as pointer, fins.read() moves forward it. fins.skip() to skip it.
class P4_InputStreamTest {
    public static void main(String args[]) throws FileNotFoundException, IOException{
        int size;
        
        // To open a file input stream.
        FileInputStream fin = new FileInputStream("D:\\Courses\\DSA\\DSAPrograms_Nptel\\12. Java.IO\\demo.txt");
        size = fin.available();

        // returns the number of bytes available
        System.out.println("Total bytes ::" + size);
        System.out.println(" First ¼ is displayed : Using read()");
        for (int i = 0; i < fin.available() / 4; i++) {
            System.out.print((char) fin.read());
        }
        System.out.println();

        System.out.println(" Remaining bytes :" + fin.available());
        System.out.println("Next ¼ is displayed : Using read( b[])");
        byte b[] = new byte[size / 4];
        if (fin.read(b) != b.length)
            System.err.println("File reading error : ");
        else {
            String temp = new String(b, 0, 0, b.length);
            // Convert the bytes into string
            System.out.println(temp);
            // display text string.
            System.out.println(" Still available:" + fin.available());
            System.out.println(" skipping ¼ : Using skip ( )");
            fin.skip(size / 4);
            System.out.println(" File remaining for read ::" + fin.available());
        }
        fin.close(); // Close the input stream
    }
}
