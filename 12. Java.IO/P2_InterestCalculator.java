
// Example 43.2: Calculator using DataInputStream
import java.io.*;

// Float.valueOf(float)
class P2_InterestCalculator {
    public static void main(String args[]) throws IOException {
        Float principalAmount = new Float(0);
        Float rateOfInterest = new Float(0);
        int numberOfYears = 0;
        DataInputStream in = new DataInputStream(System.in);
        String tempString;
        System.out.print("Enter Principal Amount: ");
        System.out.flush();
        tempString = in.readLine();
        principalAmount = Float.valueOf(tempString);
        System.out.print("Enter Rate of Interest: ");
        System.out.flush();
        tempString = in.readLine();
        rateOfInterest = Float.valueOf(tempString);
        System.out.print("Enter Number of Years:");
        System.out.flush();
        tempString = in.readLine();
        numberOfYears = Integer.parseInt(tempString);
        // Input is over: calculate the interest
        float interestTotal = principalAmount * rateOfInterest * numberOfYears;
        System.out.println("Total Interest = " + interestTotal);
    }
}