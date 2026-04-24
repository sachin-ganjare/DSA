import java.io.*;
// Example 43.5: Reading data from the File

// This Demonstrates the File&DataOutputStreams.
class ReadWritePrimitive {
    public static void main(String args[]) throws IOException {
        File primitive = new File("prim.txt");
        FileOutputStream fos = new FileOutputStream(primitive);
        DataOutputStream dos = new DataOutputStream(fos);
        
        // Write primitive data to the "prim.dat"file
        dos.writeInt(1999);
        dos.writeDouble(375.85);
        dos.writeBoolean(false);
        dos.writeChar('X');
        dos.close();
        fos.close();

        // Read data from the "prim.dat" file
        FileInputStream fis = new FileInputStream(primitive);
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readChar());
        dis.close();
        fis.close();
    }
}