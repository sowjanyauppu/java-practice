package ganeshapp;
import java.util.Scanner;
public class Divisibilitycheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=sc.nextInt();
		if (a%5==0 && a%11==0) {
			System.out.println("given number is divisible 5 and 11");
		}else {
			System.out.println("given number is not divisible 5 and 11");
		}

	}

}
