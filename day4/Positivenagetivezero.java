package ganeshapp;
import java.util.Scanner;
public class Positivenagetivezero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("it is positive number");
		}else if(a<0) {
			System.out.println("ti is nagetive number");
		}else if (a==0) {
			System.out.println("it is a Zero");
		}else {
			System.out.println(" invalid input");
		}
	}

}
