package day5;
import java.util.Scanner;
public class GrossSalaryCalculation {
  public static void main(String[] args) {
	  double grossSalary=0;
	  
     
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();
        Calculation(basicSalary,grossSalary);
        }
  public static void Calculation(double basicSalary,double grossSalary) {
	  
	  double hraPercentage=0;
	  double daPercentage=0;
      if (basicSalary <= 10000) {
          hraPercentage = 0.2;
          daPercentage = 0.8;
          double hra = basicSalary * hraPercentage;
          double da = basicSalary * daPercentage;
           grossSalary = basicSalary + hra + da;
      } else if (basicSalary <= 20000) {
          hraPercentage = 0.25;
          daPercentage = 0.9;
          double hra = basicSalary * hraPercentage;
          double da = basicSalary * daPercentage;
           grossSalary = basicSalary + hra + da;
      } else {
          hraPercentage = 0.3;
          daPercentage = 0.95;
          double hra = basicSalary * hraPercentage;
          double da = basicSalary * daPercentage;
           grossSalary = basicSalary + hra + da;
      }
      
     System.out.println(grossSalary);
      
  }
}
