package day5;
import java.util.Scanner;
public class LeapYearCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  year");
		int year=sc.nextInt();
		LeapYearCheck l=new LeapYearCheck();
		int result =l. Leapyear(year);
		if(result==1) {
			 System.out.println("It is a leapyear");
        }else {
			System.out.println("it is not a leapyear");
		}
;	}
     public int Leapyear(int x) {
    	 if(x%400==0 || x%4==0 && x%100!=0) {
       	  return 1;
         }else {
		return 0;
		}
     }
}
