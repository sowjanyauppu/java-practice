package ganeshapp;
import java.util.Scanner;
public class Grosssalarycalculation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();

        double hraPercentage;
        double daPercentage;

        if (basicSalary <= 10000) {
            hraPercentage = 0.2;
            daPercentage = 0.8;
        } else if (basicSalary <= 20000) {
            hraPercentage = 0.25;
            daPercentage = 0.9;
        } else {
            hraPercentage = 0.3;
            daPercentage = 0.95;
        }

        double hra = basicSalary * hraPercentage;
        double da = basicSalary * daPercentage;
        double grossSalary = basicSalary + hra + da;	
        System.out.println("Gross salary: "+ grossSalary);
	}

}
