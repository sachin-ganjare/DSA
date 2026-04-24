import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class P21_ReadObjectDemo {
    private static final String filepath = "D:\\Courses\\DSA\\DSAPrograms_Nptel\\12. Java.IO\\serialdemo";

    public static void main(String args[]) {
        P21_ReadObjectDemo objectIO = new P21_ReadObjectDemo();
        objectIO.readObjectFromFile();
    }

    public void readObjectFromFile() {
        try {
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            P19_Student student = (P19_Student) objectIn.readObject();
            System.out.println(student.toString());
            objectIn.close();
            System.out.println("The Object was succesfully read from the file");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
