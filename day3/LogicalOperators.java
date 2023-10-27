//Assignment 7: Logical Operators
import java.util.Scanner;
public class LogicalOperators{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the x ");
        boolean x=sc.nextBoolean();
        System.out.println("Enter the y ");
        boolean y=sc.nextBoolean();
      System.out.println("LogicalOperators x&&y = " + (x&y));
      System.out.println("LogicalOperators x&&y = " + (x&y));
      System.out.println("LogicalOperators x||y = " + (x||y));
      System.out.println("LogicalOperators x||y = " + (x||y));
      System.out.println("LogicalOperators x! = " + !(y&x) );
    }
}