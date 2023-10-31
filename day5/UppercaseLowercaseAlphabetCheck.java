package day5;
import java.util.Scanner;
public class UppercaseLowercaseAlphabetCheck {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the charter");
	char ch=sc.next().charAt(0);
	UppercaseLowercaseAlphabetCheck ul=new UppercaseLowercaseAlphabetCheck();
	int result =ul.uppercaselowercase(ch);
	if(result==1) {
	 System.out.println("the charter is in upper case");
    }else if(result==0) {
   	 System.out.println("the charter is in lower case");
    }else {
    System.out.println("invalid input");
    }
	}
    public int uppercaselowercase(char ch) {
    	if(ch>='A'&&ch<='Z') {
	    	 return 1;
	     }else if(ch>='a'&&ch<='z') {
	    	 return 0;
	     }else {
	    	 return 2;
	     }
    }
}
