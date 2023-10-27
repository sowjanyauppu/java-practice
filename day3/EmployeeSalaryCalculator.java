//Employee Salary Calculator:
import java.util.Scanner;
public class EmployeeSalaryCalculator {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the monthly salary");
      double ms=sc.nextDouble();
      double as=ms*12;
      double  taxRate;
      if(as<=50000){
       taxRate =0.25;
      }else if(as<=10000){
            taxRate =0.30;
      }else {
        taxRate =0.45; 
      }
     double tax = as * taxRate;
     double netSalary = as - tax;
     System.out.println("Annual Salary:" + as);
     System.out.println("Tax:" + tax);
     System.out.println("Net Salary:" + netSalary);
    }
}