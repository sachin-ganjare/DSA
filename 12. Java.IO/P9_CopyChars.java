// Example 44.3: Copying files using FileReader and FileWriter

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Reader and Writer Character Stream classes
public class P9_CopyChars {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("./demo_file.txt");
            fw = new FileWriter("./filewriter_generated.txt");
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
        } finally {
            if (fr != null) {
                fr.close();
            }
            if (fw != null) {
                fw.close();
            }
        }
    }
}