package ganeshapp;
import java.util.Scanner;
public class AlphabetDigitorSpecialCharacterCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charter");
	     char ch=sc.next().charAt(0);
	     if(ch>='a'&& ch<='z') {
	    	 System.out.println("it is a charter");
	     }else if(ch>='0'&&ch<='9'){
	    	 System.out.println("it is a number");
	     }else {
	    	 System.out.println("it is a specialcharter");
	     }
	}

}
//Good
