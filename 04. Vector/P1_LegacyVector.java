    import java.util.Enumeration;
    import java.util.Vector;
    public class P1_LegacyVector {
    public static void main(String[] args) {
        int size = 20;
        int index = 2;

        Vector<Object> v1 = new Vector<Object>(size);
        v1.add(1);
        v1.add(2);
        v1.add("a string");
        v1.add(45);
        v1.add("another string");

        // Insertion Operation
        v1.addElement(2);
        // v1.insertElementAt(collection, 3);
        // v1.addAll(collection);

        // Removal Operation
        v1.removeElement(2);
        v1.removeElementAt(index);
        // v1.removeAllElements(); // removes all elements
        // v1.clear(); 
        
        // Modification
        v1.setElementAt(4,1);
        v1.lastIndexOf(2);


        // Enumerate:
        Enumeration vEnum = v1.elements();
        while(vEnum.hasMoreElements()){
            System.out.println(vEnum.nextElement()+" ");
        }

        // Searching:
        System.out.println(v1.contains(2));

        // Bulk Operations and helper methods:
        System.out.println(v1.size());
        System.out.println(v1.capacity());
        // v1.retainAll(anotherCollection)
        // v1.clone()
        // v1.copyInto(array[])
        // v1.equals(v2)
        // v1.hashCode();
    

    }    
    }
