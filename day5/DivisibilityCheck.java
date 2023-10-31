package day5;
import java.util.Scanner;
public class DivisibilityCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=sc.nextInt();
		DivisibilityCheck d=new DivisibilityCheck();
		int result =d.checkthenumber(a);
		if (result==1) {
			System.out.println("given number is divisible 5 and 11");
		}else {
	    System.out.println("given number is not divisible 5 and 11");
		}
		System.out.println(result);
	}
    public int checkthenumber(int a) {
    	if (a%5==0 && a%11==0) {
			return 1;
		}else {
			return 0;
		}
    }
}
