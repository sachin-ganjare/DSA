public class P5_StringMethodsForConversion {
    public static void main(String[] args) {
    
        // Convert string values into numbers.
        System.out.println("\nString to number conversion");
        String intText = "95";
        String decimalText = "95.59";
        int intValue = Integer.parseInt(intText);
        float floatValue = Float.parseFloat(decimalText);
        double doubleValue = Double.parseDouble(decimalText);
        System.out.println("Integer.parseInt(\"95\") + 5 = " + (intValue + 5));
        System.out.println("Float.parseFloat(\"95.59\") + 4.41f = " + (floatValue + 4.41f));
        System.out.println("Double.parseDouble(\"95.59\") + 4.41 = " + (doubleValue + 4.41));

        // Convert numbers back to strings.
        System.out.println("\nNumber to string conversion");
        int number = 20;
        float marks = 15.5F;
        System.out.println("String.valueOf(20) + 20 = " + (String.valueOf(number) + 20));
        System.out.println("String.valueOf(15.5F): " + String.valueOf(marks));

        // Show the same number in different bases.
        System.out.println("\nNumber system conversion");
        int value = 19648;
        System.out.println("Binary: " + Integer.toBinaryString(value));
        System.out.println("Octal: " + Integer.toOctalString(value));
        System.out.println("Hexadecimal: " + Integer.toHexString(value));
    }
}
