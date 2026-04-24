import java.util.ArrayList;
import java.util.Arrays;

//Example 14.3: Converting array items into String objects
import java.util.List;

public class P1_ArraysClass {
    public static void main(String[] args) {
    
        Integer[] intArr = { 1, 2, 3 };
        int intArr2[][] = { { 10, 20, 15, 22, 35 } };

        //non resizable List from array
        List<Integer> fixedList = Arrays.asList(intArr);
        System.out.println("Integer Array as List: " + Arrays.asList(intArr)); // To convert the elements as List (not resizable)

        // resizable arrayList from array
        ArrayList<Integer> pList = new ArrayList<>(fixedList);
        System.out.println("Integer Array as ArrayList: "); 
        pList.forEach((i) -> System.out.print(i + " ")); 

        
        // stream from array
        System.out.println("Integer Array Stream: " + Arrays.stream(intArr));

        // print string
        System.out.println("Integer Array String: " + Arrays.toString(intArr));

        //print deepstring
        System.out.println("Integer Array DeepString: " + Arrays.deepToString(intArr2));

        //making copy
        System.out.println("Integer Array Copy: (Length 10)" + Arrays.toString(Arrays.copyOf(intArr, 10)));

    }
}
