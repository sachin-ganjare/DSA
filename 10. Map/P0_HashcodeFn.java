public class P0_HashcodeFn {
    public static void main(String[] args) {
        Integer x; Integer h;
        x = 555;
        System.out.println("Value of X: "+x);
        h = x.hashCode(); // Return a hash code for the key x
        System.out.println("Value of H: "+h );
        
        Double y = 123.45;
        System.out.println("Value of Y: "+y );
        
        h = y.hashCode(); // Return a hash code for the key y
        System.out.println("Value of H: "+h );
        
        h = "Debasis".hashCode(); // Return the hash code for the object “Debasis”
        System.out.println("Value of H: "+h );
    }
}
