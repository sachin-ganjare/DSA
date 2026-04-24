
// Example 43.3: Reading bytes from a file and display data
// Read the file address from the Command Line
import java.io.*;

class P3_ReadBytesDemo {
    public static void main(String args[]) {
        FileInputStream infile = null; // Create an input file stream
        int b;
        try {
            infile = new FileInputStream(args[0]);
            // Connect infile stream to the required file
            while ((b = infile.read()) != -1) {
                System.out.print((char) b); // Read and display data
            }
            infile.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}