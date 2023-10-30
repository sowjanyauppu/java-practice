package ganeshapp;
import java.util.Scanner;
public class DayofWeek {

	public static void main(String[] args) {
		int day=0;
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the day value");
		 day=sc.nextInt();
		switch (day) {
		 
			 
		 case 1:
			System.out.printf("Sunday");
			break;
			
		case 2: 
			System.out.printf("Monday");
			break;
		case 3: 
			System.out.printf("Tuesday");
			break;
		case 4: 
			System.out.printf("Wednesday");
			break;
		case 5: 
			System.out.printf("Thursday");
			break;
		case 6: 
			System.out.printf("Friday");
			break;
		case 7: 
			System.out.printf("Saturday");
			break;
		
		default:
			System.out.printf("Invalid...Please Enter the 0 to 6...");
			break;
		}
			
		
	}

}
