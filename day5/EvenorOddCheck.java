package day5;
import java.util.Scanner;
public class EvenorOddCheck {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the a value");
	 int a=sc.nextInt();
	 EvenorOddCheck e=new EvenorOddCheck();
	 int result=e.EvenorOdd(a);
	 if(result==1) {
		System.out.println("it is an even number");
		}else {
		System.out.println("it is an odd number");
		}
	}
    public int EvenorOdd(int a) {
    	if(a%2==0) {
			return 1;
		}else {
			return 0;
		}
    }
}
