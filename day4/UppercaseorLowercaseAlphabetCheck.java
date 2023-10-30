package ganeshapp;
import java.util.Scanner;
public class UppercaseorLowercaseAlphabetCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charter");
	     char ch=sc.next().charAt(0);
	     if(ch>='A'&&ch<='Z') {
	    	 System.out.println("the charter is in upper case");
	     }else if(ch>='a'&&ch<='z') {
	    	 System.out.println("the charter is in lower case");
	     }
	}

}
