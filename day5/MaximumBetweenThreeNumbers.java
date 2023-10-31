package day5;
import java.util.Scanner;
public class MaximumBetweenThreeNumbers {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value");
	int a=sc.nextInt();
	System.out.println("Enter b value");
	int b=sc.nextInt();
	System.out.println("Enter c value");
	int c=sc.nextInt();	
	MaximumBetweenThreeNumbers mx=new MaximumBetweenThreeNumbers();
    int result =mx.MaxBetweenThree(a, b, c);
    if(result==1){
    	System.out.println("a is grather  ");
	} else if(result==2) {
		System.out.println("b is grather  ");
	}else {
		System.out.println("c is grather  ");
	}
	}
	public int MaxBetweenThree(int a,int b,int c) {
		if (a>=b && a>=c) {
			return 1;
		} else if(b>=a && b>=c) {
			return 2;
		}else {
			return 3;
		}
	}

}
