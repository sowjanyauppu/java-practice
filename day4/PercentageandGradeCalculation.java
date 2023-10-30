package ganeshapp;
import java.util.Scanner;
public class PercentageandGradeCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the Physics Marks");
		int Physics=sc.nextInt();
		System.out.println("Enter the Chemistry Marks");
		int Chemistry=sc.nextInt();
		System.out.println("Enter the Biology Marks");
		int Biology=sc.nextInt();
		System.out.println("Enter the Mathematics Marks");
		int Mathematics=sc.nextInt();
		System.out.println("Enter the Computer Marks");
		int Computer =sc.nextInt();
		int result= (Physics+Chemistry+Biology+Mathematics+Computer)/5;
		if(result>80&&result<100) {
			System.out.println("Grade A");
		}else if(result>60&&result<80) {
			System.out.println("Grade B");
		}else if(result>45&&result<60) {
			System.out.println("Grade c");
		}else {
			System.out.println("Fail");
		}
		
	}

}
