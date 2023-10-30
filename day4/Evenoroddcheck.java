package ganeshapp;
import java.util.Scanner;
public class Evenoroddcheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("it is an even number");
		}else {
			System.out.println("it is an odd number");
		}

	}

}
