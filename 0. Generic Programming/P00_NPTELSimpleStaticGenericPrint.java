class P00_NPTELSimpleStaticGenericPrint {
    // Example 2.1 and 2.2
    static <T> void genericPrint(T x){
        System.out.println(x.getClass().getName() + " : " + x);
    }
    public static void main (String args[]){
        // P00_SimpleGenericPrint demo;
        // demo = new P00_SimpleGenericPrint();
        // demo.genericPrint(101);
        genericPrint("Hello");
        genericPrint(3.14);
    }
}
