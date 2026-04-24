
/* This Java program illustrates working of EnumMap and its functions. */
import java.util.EnumMap;

public class P1_EnuMapExample {
    public enum SIZE {
        S, M, L, X
    };

    public static void main(String args[]) {
        // Creating EnumMap in java with key as enum type STATE
        EnumMap<SIZE, String> enuMap = new EnumMap<SIZE, String>(SIZE.class);
        // Putting values inside EnumMap in Java
        // Inserting Enum keys different from their natural order
        enuMap.put(SIZE.S, "Children");
        enuMap.put(SIZE.M, "Young");
        enuMap.put(SIZE.L, "Aged");
        enuMap.put(SIZE.X, "Old");
        // Printing size of EnumMap in java
        System.out.println("Size of EnumMap : " + enuMap.size());
        // Printing Java EnumMap
        System.out.println("EnumMap: " + enuMap);
        // Retrieving value from EnumMap in java
        System.out.println("Key : " + SIZE.S + " Value: " + enuMap.get(SIZE.S));
    }
}