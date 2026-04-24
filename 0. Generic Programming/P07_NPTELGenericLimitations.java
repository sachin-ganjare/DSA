class Student<T extends Number> {
    String name;
    T[] marks;

    Student(T[] m) {
        marks = m;
    }

    double total() {
        double sum = 0.0;
        for (int i = 0; i < marks.length; i++)
            sum += marks[i].doubleValue(); // this gives error if T doens't extend "Number";
        return sum;
    }

    //Question mark -> No type-specific operations
    boolean compare(Student<?> OtherStudent) {
        if(total()==OtherStudent.total()){
            return true;
        }
        else{
            return false;
        }
    }
}

public class P07_NPTELGenericLimitations {
    public static void main(String[] args) {
        Student<Double> S1 = new Student<Double>(new Double[] { 20.02, 0.20, 120.00 });
        System.out.println("Total Marks:" + S1.total());

        Student<Integer> S2 = new Student<Integer>(new Integer[] { 20, 0, 120 });
        System.out.println("Total Marks:" + S2.total());
        System.out.println("The passed Student is " + S1.compare(S2));
    }
}
