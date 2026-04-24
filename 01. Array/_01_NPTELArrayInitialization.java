import java.util.Scanner;
import java.util.Arrays; // Arrays.toString(Arrays.copyOf(a, size))
//NPTEL Example 12.4

class exampleArrayInit {
    int[] a = new int[100]; 
    int size; 

    void loadArray() {
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter size < 100");
        size = in.nextInt(); // read a number

        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + "th number ");
            a[i] = in.nextInt(); 
        }

        System.out.println("Length = " + a.length);     
        System.out.println("Size = " + size);         
        System.out.println("Array elements: " + Arrays.toString(Arrays.copyOf(a, size)));
        in.close();
        int []b =(int[]) a.clone();
    }
}

class _01_NPTELArrayInitialization{
    public static void main(String[] args) {
        exampleArrayInit newArr = new exampleArrayInit();
        newArr.loadArray();
    }
}