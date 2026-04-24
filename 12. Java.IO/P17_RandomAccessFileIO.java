// Example 46.3: Reading and writing RAF

import java.io.*;

class P17_RandomAccessFileReadWrite {
    public static void main(String args[]) {
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile("rand.dat", "rw");

            // Writing to the file
            file.writeChar('X');
            file.writeInt(555);
            file.writeDouble(3.1412);
            file.seek(0); // Go to the beginning

            // Reading from the file
            System.out.println(file.readChar());
            System.out.println(file.readInt());
            System.out.println(file.readDouble());
            file.seek(2); // Go to the second item
            System.out.println(file.readInt());

            // Go to the end and append false to the file
            file.seek(file.length());
            file.writeBoolean(false);
            file.seek(4);
            System.out.println(file.readBoolean());
            file.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}