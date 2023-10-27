//Assignment 5: Arithmetic Operators
import java.util.Scanner;
public class ArithmeticOperators{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the x value");
        int x=sc.nextInt();
        System.out.println("Enter the y value");
        int y=sc.nextInt();
       System.out.println("ArithmeticOperators(x+y) = " + (x+y));
       System.out.println("ArithmeticOperators (x-y) = " +(x-y) );
      System.out.println("ArithmeticOperators (x*y) = " +(x*y) );
      System.out.println("ArithmeticOperators (x/y) = " + (x/y));
       System.out.println("ArithmeticOperators (x/y) = " + (x%y));
    }
}