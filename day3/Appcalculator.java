//Calculator App : create an application that takes a two values along with operator and find the value based on operator.
import java.util.Scanner;
public class Appcalculator{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of num1");
       int num1=sc.nextInt();
       System.out.println("Enter the value of num2");
      int num2=sc.nextInt();
      System.out.println("Enter the operator (+, -, *, /): ");
      char operator = sc.next().charAt(0);
      if (operator == '+') {
            System.out.println(num1+num2);
        } else if (operator == '-') {
             System.out.println(num1-num2);
        } else if (operator == '*') {
          System.out.println(num1*num2);
        } else if (operator == '/') {
            System.out.println(num1/num2);
        } else {
            System.out.println("invalid input");
        }
            
        }
    }       
