// Example 46.4: Appending to a RAF
import java.io.*;

class P18_RandomAccessFileAppend {
    static public void main(String args[]) {
        RandomAccessFile rFile;
        try {
            rFile = new RandomAccessFile("city.txt", "rw");
            rFile.seek(rFile.length()); // Go to the end
            rFile.writeBytes("MUMBAI\n"); // Append MUMBAI
            rFile.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}