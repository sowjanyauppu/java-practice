//Temperature Converter: Create an application that takes a temperature in Celsius or Fahrenheit as input and converts it to the other unit. Use conditional statements to determine whether to convert from Celsius to Fahrenheit or vice versa.
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("Enter your choice (1/2): ");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = input.nextDouble();
            double fahrenheit =(celsius*9/5)+32 ;
            System.out.printf("celsiusToFahrenheit "+fahrenheit);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double celsius =(fahrenheit*9/5)-32 ;
            System.out.printf("fahrenheitToCelsius"+celsius);
        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }

    }
}