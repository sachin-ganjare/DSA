public class P04_NPTELVarargsMethod {
    // NPTEL program 2.9
    // MostElegant Uses both, ellipsis and objects
    public static void varargsMethod3(Object... obj) {
        for (Object o : obj)
            System.out.print(" " + o);
        System.out.println();
    }

    /*
     *  // Method 2.8: following is also preferred 
     *  static void varargsMethod1(int v[]) {
     *      System.out.print("Number of args: " + v.length + " Elements: ");
     *      for (int x : v)
     *          System.out.print(x + " ");
     *      System.out.println();
     *  }
     */
    public static void main(String[] args) {
        varargsMethod3(1, "String", 2.3, true); // Four arguments
        varargsMethod3(); // No arguments
        varargsMethod3(15, 25, 35, 45, 55); // Five arguments
    }

}
