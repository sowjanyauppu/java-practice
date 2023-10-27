 //Assignment 1: Area and Perimeter
 import java.util.Scanner;
 public class Rectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
        int length = sc.nextInt();
        System.out.println("enter the breath");
        int breath = sc.nextInt();
      int area=length*breath;
      int perimeter =2*(length+breath);
      System.out.println("area of rectangle " + area);
      System.out.println("perimeter of rectangle " + perimeter);

      
    }
}