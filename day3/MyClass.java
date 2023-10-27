// Electricity bill app along with GST
import java.util.Scanner; 
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter previous units: ");
        int pUnits = sc.nextInt();
        System.out.println("Enter present units: ");
        int prUnits = sc.nextInt();
        int unitsconsumed = prUnits - pUnits;
        double bill = 0.0;
        if (unitsconsumed <= 50) {
            bill = unitsconsumed * 0.50;
        } else if (unitsconsumed <= 150) {
            bill = 50 * 0.50 + (unitsconsumed - 50) * 0.75;
        } else if (unitsconsumed <= 250) {
            bill = 50 * 0.50 + 100 * 0.75 + (unitsconsumed - 150) * 1.20;
        } else {
            bill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (unitsconsumed - 250) * 1.50;
        }
        double gst = (bill * 0.18);
        double totalBill = bill + gst;

      System.out.println("totall bill including Gst " +totalBill );
    }
}