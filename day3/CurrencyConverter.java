//Currency Converter
import java.util.Scanner;
public class CurrencyConverter{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the amount in the source currency: ");
    double sourceAmount = scanner.nextDouble();
    System.out.print("Enter the exchange rate (source to target currency): ");
    double exchangeRate = scanner.nextDouble();
    double targetAmount = sourceAmount * exchangeRate;
    System.out.println(targetAmount);
    }
}