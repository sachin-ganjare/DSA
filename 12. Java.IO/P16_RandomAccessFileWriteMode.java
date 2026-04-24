// Example 46.2: Writing into a RAF

import java.io.IOException;
import java.io.RandomAccessFile;

public class P16_RandomAccessFileWriteMode {
    static final String FILEPATH = "myFile.TXT";

    public static void main(String[] args) {
        try {
            writeToFile(FILEPATH, "Data Structures and Algorithms Using Java", 41);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToFile(String filePath, String data, int position)
            throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }
}