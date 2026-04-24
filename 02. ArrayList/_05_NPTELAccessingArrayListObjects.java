import java.util.ArrayList;

//Example 13.5: Accessing objects in an ArrayList collection
public class _05_NPTELAccessingArrayListObjects {
    public static void main(String[] args) {
        ArrayList<String> topCompanies = new ArrayList<String>();
        // Check if an ArrayList is empty
        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());
        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");
        // Find the size of an ArrayList
        System.out.println("Here are the top " + topCompanies.size() + " Companies in the world");
        System.out.println(topCompanies); // Print the companies names
        // Retrieve the element at a given index
        String bestCompany = topCompanies.get(0);
        System.out.println("Best Company: " + bestCompany);
        String secondBestCompany = topCompanies.get(1);
        System.out.println("Second Best Company: " + secondBestCompany);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);
        System.out.println("Last Company in the list: " + lastCompany);
        // Modify the element at a given index
        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list: " + topCompanies);
    }
}
