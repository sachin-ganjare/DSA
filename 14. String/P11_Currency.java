import java.util.*;

class P11_Currency {
    public static void main(String args[]) {
        Currency c;
        c = Currency.getInstance(Locale.getDefault());
        System.out.println("Name: " + c.getDisplayName());
        System.out.println("Symbol: " + c.getSymbol());
        System.out.println("Default fractional digits: " +
                c.getDefaultFractionDigits());
    }
}