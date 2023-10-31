package day5;
import java.util.Scanner;
public class CountingTotalNumberofNotes {

	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the amount");
		 int amount = scanner.nextInt();
		 int note2000 = 0,note500 = 0,note200 = 0,note100 = 0,note50 = 0,note20 = 0,note10=0;		
		 CountingTotalNumberofNotes cn=new CountingTotalNumberofNotes();
		 double result=cn.NoteCount(amount,note2000,note500,note200,note100,note50,note20,note10);
		 if(result==1.0) {
		  System.out.println(amount);
	      System.out.println(note2000);
		 }
		 if(result==2) {
			 System.out.println(amount);
	         System.out.println(note500);	 
		 }
		 if(result==3) {
			 System.out.println(amount); 
			 System.out.println(note200);
		 }
		 if(result==4) {
			 System.out.println(amount);
			 System.out.println(note100);
		 }
		 if(result==5) {
			 System.out.println(amount);
			 System.out.println(note50);
		 }
		 if(result==6) {
			 System.out.println(amount);
			 System.out.println(note20);
		 }
		 if(result==7) {
			 System.out.println(amount);
			 System.out.println(note10);
		 }
	}
	public double NoteCount(int amount, int note2000, int note500,int note200,int note100,int note50,int note20,int note10) {
		if (amount >= 2000) {
            note2000 = amount / 2000;
            amount = amount%2000;
            return 1.0;
        }
        if (amount >= 500) {
            note500=amount / 500;
            amount =amount%500;
            return 2.0;
        }
        if (amount >= 200) {
            note200=amount / 200;
            amount =amount%200;
            return 3.0;
        }
        if (amount >= 100) {
            note100 =amount / 100;
            amount =amount%100;
            return 4.0;
        }
        if (amount >= 50) {
            note50=amount / 50;
            amount=amount%50;
            return 5.0;
        }
        if (amount >= 20) {
            note20=amount / 20;
            amount=amount%20;
            return 6.0;
        }
        if (amount >= 10) {
            note10=amount / 10;
            amount=amount%10;
            return 7.0;
        }
		return 8.0;
     }
}
	
	



