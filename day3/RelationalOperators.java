//Assignment 6: Relational Operators
import java.util.Scanner;
public class RelationalOperators{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the x value");
        int x=sc.nextInt();
        System.out.println("Enter the y value");
        int y=sc.nextInt();
      System.out.println("RelationalOperators(x==y) = " +(x==y) );
      System.out.println("RelationalOperators(x!=y) = " +(x!=y) );
      System.out.println("RelationalOperators(x>y) = " +(x>y) );
      System.out.println("RelationalOperators(x<y) = " +(x<y) );
      System.out.println("RelationalOperators(x>=y) = " +(x>=y) );
      System.out.println("RelationalOperators(x=<y) = " +(x<=y) );
    }
}