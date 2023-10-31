package day5;
import java.util.Scanner;
public class MaximumBetweenTwoNumbers {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
    System.out.println("Enter the a value");
    int a= sc.nextInt();
    System.out.println("Enter the b value");
    int b= sc.nextInt();	
    MaximumBetweenTwoNumbers mb=new  MaximumBetweenTwoNumbers();
    int result=mb.Maxoftwonumbers(a,b);
    if(result==1) {
    	System.out.println("a is greater than b");
    }else {
		System.out.println("b is greater than a");
    }
	}
	public int Maxoftwonumbers(int x,int y) {
		if(x>y) {
        	return 1;
        }else {
			return 0;
		}
	}

}
