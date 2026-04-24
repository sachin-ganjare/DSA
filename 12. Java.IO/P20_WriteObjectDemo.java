
// Example 46.5: Reading and writing objects (create objects and writing)
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class P20_WriteObjectDemo {
    private static final String filepath = "D:\\Courses\\DSA\\DSAPrograms_Nptel\\12. Java.IO\\serialdemo";

    public static void main(String args[]) {
        P20_WriteObjectDemo objectIO = new P20_WriteObjectDemo();
        int m[] = { 50, 47, 89, 65, 78 };
        P19_Student student = new P19_Student("John", "Frost", 22, m);
        objectIO.writeObjectToFile(student);
    }

    public void writeObjectToFile(Object serObj) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object is successfully written to a file");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

