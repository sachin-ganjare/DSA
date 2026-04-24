class MyClass<T> {
    void genericPrint(T x) {
        System.out.println("Your value is: + " + x);
    }
}

public class P03_ExternalClassGeneric {
    public static void main(String args[]) {
        MyClass<Integer> c_01;
        c_01 = new MyClass<>();
        c_01.genericPrint(2);
    }
}
