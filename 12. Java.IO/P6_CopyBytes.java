// Example 43.6: Copying bytes from one file to another

import java.io.*;

class P6_CopyBytes {
    public static void main(String args[]) {
        // Declare input and output file streams
        FileInputStream infile = null;
        FileOutputStream outfile = null;

        // Declare a variable to hold a byte
        byte byteRead;
        try {
            // Connect infile to in.dat
            infile = new FileInputStream("in.dat");
            // Connect outfile to out.dat
            outfile = new FileOutputStream("out.dat");
            // Reading bytes from in.dat and writing to out.dat
            do {
                byteRead = (byte) infile.read();
                outfile.write(byteRead);
            } while (byteRead != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File notfound");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally // Close files
        {
            try {
                infile.close();
                outfile.close();
            } catch (IOException e) {
            }
        }
    }
}