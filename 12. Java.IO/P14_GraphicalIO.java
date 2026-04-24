
//  GraphicalIO
import java.io.*;
import java.awt.*;
import java.awt.event.*;

// setup action handleEv
class StudentFile extends Frame {
    // Defining window components
    TextField number, name, marks;
    Button enter, done;
    Label numLabel, nameLabel, markLabel;
    DataOutputStream dos;

    // Initialize the Frame
    public StudentFile() {
        super("Create Student File");
    }

    // Setup the window
    public void setup() {
        setSize(400, 200);
        setLayout(new GridLayout(4, 2));

        // Create the components of the Frame
        number = new TextField(25);
        number = new TextField(25);
        numLabel = new Label("Roll Number");
        name = new TextField(25);
        nameLabel = new Label("Student Name");
        marks = new TextField(25);
        markLabel = new Label("Marks");
        enter = new Button("ENTER");
        done = new Button("DONE");

        // Add the components to the Frame
        add(numLabel);
        add(number);
        add(nameLabel);
        add(name);
        add(markLabel);
        add(marks);
        add(enter);
        add(done);

        // Show the Frame
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                cleanup(); // write remaining data and close file
                System.exit(0); // terminate program
            }
        });

        // Open the file
        try {
            dos = new DataOutputStream(new FileOutputStream("student.dat", true));
        }

        catch (IOException e) {
            System.err.println(e.toString());
            System.exit(1);
        }
    }

    // Write to the file
    public void addRecord() {
        int num;
        Double d;
        num = (Integer.parseInt((number.getText())));
        try {
            dos.writeInt(num);
            dos.writeUTF(name.getText());
            d = Double.parseDouble(marks.getText());
            dos.writeDouble(d);
        } catch (IOException e) {
        }
        // Clear the text fields
        number.setText("");
        name.setText("");
        marks.setText("");
    }

    // Adding the record and clearing the TextFields
    public void cleanup() {
        if (!number.getText().equals("")) {
            addRecord();
        }
        try {
            dos.flush();
            dos.close();
        } catch (IOException e) {
        }
    }

    // Processing the event
    public boolean action(Event event, Object o) {
        if (event.target instanceof Button)
            if (event.arg.equals("ENTER")) {
                addRecord();
                return true;
            }
        return super.action(event, o);
    }

    public boolean handleEvent(Event event) {
        if (event.target instanceof Button)
            if (event.arg.equals("DONE")) {
                cleanup();
                System.exit(0);
                return true;
            }
        return super.handleEvent(event);
    }

    // Execute the program
    public static void main(String args[]) {
        StudentFile student = new StudentFile();
        student.setup();
    }
}