package ganeshapp;
import java.util.Scanner;
public class Maximumofthree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt();
		System.out.println("Enter c value");
		int c=sc.nextInt();
		if (a>=b && a>=c) {
			System.out.println("a is grather  ");
		} else if(b>=a && b>=c) {
			System.out.println("b is grather  ");
		}else {
			System.out.println("c is grather  ");
		}
	}

}
