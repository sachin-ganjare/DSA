import java.util.*;

class P6_HashSetCollectionDemo {
    public static void main(String args[]) {
        // Creating a hash set from a collection
        List<Integer> list = Arrays.asList(3, 9, 2, 4, 6, 2, 5, 3, 8, 9, 1, 7, 8, 6);
        System.out.println(list);
        HashSet<Integer> uniqueNumbers = new HashSet<>(list);
        System.out.println(uniqueNumbers);
        Set<Integer> bigSet = new HashSet<>(1000);
        for (int i = 0; i < 1000; i++)
            bigSet.add((int) (Math.random()*1000));
        System.out.println("If 555 is in bigSet" + bigSet.contains(555));
        System.out.println(bigSet);
    }
}