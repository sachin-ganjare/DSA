import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employees implements Iterable<Employee> {
    private List<Employee> emps;

    public Employees() {
        emps = new ArrayList<>();
        emps.add(new Employee(101, "Ram", "Professor", 250000));
        emps.add(new Employee(102, "Rahim", "Engineer", 300000));
        emps.add(new Employee(103, "Jonny", "Doctor", 350000));
    }

    @Override
    public Iterator<Employee> iterator() {
        return emps.iterator();
    }
}

public class P9_EmployeesTester {
    public static void main(String[] args) {
        Employees emps = new Employees();

        Iterator<Employee> it = emps.iterator();
        while (it.hasNext()) {
            Employee emp = it.next();

            System.out.println("ID: " + emp.getEmpid());
            System.out.println("Name: " + emp.getEname());
            System.out.println("Designation: " + emp.getDesignation());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("toString(): " + emp);
            System.out.println("------------------------");
        }

        System.out.println("Using for-each loop:");
        for (Employee emp : emps) {
            System.out.println(emp);
        }
    }
}

class Employee {
    private int empid;
    private String ename;
    private String designation;
    private double salary;

    public Employee(int empid, String ename, String designation, double salary) {
        this.empid = empid;
        this.ename = ename;
        this.designation = designation;
        this.salary = salary;
    }

    public int getEmpid() { return empid; }
    public String getEname() { return ename; }
    public String getDesignation() { return designation; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return empid + "\t" + ename + "\t" + designation + "\t" + salary;
    }
}