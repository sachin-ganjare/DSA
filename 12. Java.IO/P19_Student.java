// Example 46.5: Reading and writing objects (Defining objects)

import java.io.Serializable;
import java.util.*;

public class P19_Student implements Serializable {
    // default serialVersion id
    private static final long serialVersionUID = 1L;
    private String firstName;
    private String lastName;
    private int age;
    private int marks[] = new int[5];

    public P19_Student(String fname, String lname, int age, int smarks[]) {
        this.firstName = fname;
        this.lastName = lname;
        this.age = age;
        this.marks = smarks;
    }

    public void setFirstName(String fname) {
        this.firstName = fname;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lname) {
        this.firstName = lname;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setMarks(int smarks[]) {
        this.marks = smarks;
    }

    public int[] getMarks() {
        return this.marks;
    }

    @Override
    public String toString() {
        return new StringBuffer(" \nFirst Name: ").append(this.firstName)
                .append(" \nLast Name : ").append(this.lastName)
                .append(" \nAge : ").append(this.age)
                .append(" \nMarks : ")
                .append(Arrays.toString(this.marks)).toString();
    }
}
