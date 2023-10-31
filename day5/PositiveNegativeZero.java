package day5;
import java.util.Scanner;
public class PositiveNegativeZero {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the a value");
	int a=sc.nextInt();	
	 PositiveNegativeZero pz=new PositiveNegativeZero();
	 int result=pz.PositiveNegativeZerologic(a);
	 if(result==0) {
		 System.out.println("it is positive number");
		}else if(result==1) {
			System.out.println("ti is nagetive number");
		}else if (result==2) {
			System.out.println("it is a Zero");
		}else {
			System.out.println(" invalid input");
		}
	}
    public int  PositiveNegativeZerologic(int a) {
    	if(a>0) {
			return 0;
		}else if(a<0) {
			return 1;
		}else if (a==0) {
			return 2;
		}else {
			return 3;
		}
    	
    }
}
