// 45.2 Storing and Reading data in the same file.
import java.io.*;

class P11_ReadWriteIntegers {
    public static void main(String args[]) throws IOException {
        DataInputStream dis = null; // Input stream
        DataOutputStream dos = null; // Output stream
        File intFile = new File("rand.dat");
        // Construct a file
        // Writing integers to rand.dat file
        try { // Create output stream for intFile file
            dos = new DataOutputStream(new FileOutputStream(intFile));
            for (int i = 0; i < 20; i++)
                dos.writeInt((int) (Math.random() * 100));
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } finally {
            dos.close();
        }

        // Reading integers from rand.dat file
        try {
            // Create input stream for intFile file
            dis = new DataInputStream(new FileInputStream("intFile"));
            for (int i = 0; i < 20; i++) {
                int n = dis.readInt();
                System.out.print(n + " ");
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } finally {
            dis.close();
        }
    }
}