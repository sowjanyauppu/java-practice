package day5;
import java.util.Scanner;
public class DayofWeek {
public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);	
System.out.println("Enter the day value");
int day=sc.nextInt();
DayofWeek dw=new DayofWeek();
int result=dw.DayofWeeklogic(day);
if(result==1) {
    System.out.println("Sunday");
}else if(result ==2) {
	System.out.println("Monday");
}else if(result ==3) {
	System.out.println("Tuesday");
}else if(result ==4) {
	System.out.println("Wednesday");
}else if(result ==5) {
	System.out.println("Thursday");
}else if(result ==6) {
	System.out.println("Friday");
}else if(result==7) {
	System.out.println("Saturday");
}else {
	System.out.println("Invalid input");
}
}
public int DayofWeeklogic(int day) {
	if(day ==1) {
		return 1;
	}else if(day ==2) {
		return 2;
	}else if(day ==3) {
		return 3;
	}else if(day ==4) {
		return 4;
	}else if(day ==5) {
		return 5;
	}else if(day ==6) {
		return 6;
	}else if(day==7) {
		return 7;
	}else {
		return 0;
	}


}

}
