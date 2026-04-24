class P02_IMPGenericMethodWithTwoDifferentTypePassing {
    static <T, U> void swapMethod(T param1, U param2) {
        // One is String another is Integer
        T temp1 = param1;
        param1 = (T) param2; // Will fail if not type-compatible
        param2 = (U) temp1;  // Will fail if not type-compatible

        System.out.println("Param 1 is = " + param1 + " and Param 2 is = " + param2 + "!");
    }

    public static void main(String[] args) {
        System.out.println("Swapping Program Started!");
        String text = "Hello";
        Integer number = 42;

        System.out.println("Before: " + text + " , " + number);
        swapMethod(text, number);
    }
}
