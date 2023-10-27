//Assignment 2: Distance Calculator
import java.util.Scanner;
public class Distancepoint {
    public static void main(String args[]) {
        double distance;
     Scanner sc =new Scanner(System.in);
     System.out.println("enter x1 point");
     double x1=sc.nextInt();
     System.out.println("enter y1 point");
     double y1=sc.nextInt();
	 System.out.println("enter x2point");
     double x2=sc.nextInt();
	 System.out.println("enter y2 point");
	 double y2=sc.nextInt();
      distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
      System.out.println("distance between" + distance);
    }
}