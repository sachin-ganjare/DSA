// Example 45.3: Concatenation and buffering

import java.io.*;

class P12_MergeFilesDemo {
    public static void main(String args[]) throws IOException {
        // Declare file streams
        FileInputStream file1 = null;
        FileInputStream file2 = null;
        SequenceInputStream file3 = null;
        // Declare file3 to store combined files
        file1 = new FileInputStream("text1.dat"); // Open the files to be concatenated
        file2 = new FileInputStream("text2.dat"); // Open the files to be concatenated
        file3 = new SequenceInputStream(file1, file2); // Concatenate filel and file2
        // Create buffered input and output streams
        BufferedInputStream inBuffer = new BufferedInputStream(file3);
        BufferedOutputStream outBuffer = new BufferedOutputStream(System.out);
        // Read and write till the end of buffers
        int ch;
        while ((ch = inBuffer.read()) != -1)
            outBuffer.write((char) ch);
        inBuffer.close();
        outBuffer.close();
        file1.close();
        file2.close();
    }
}