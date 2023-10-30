package ganeshapp;
import java.util.Scanner;
public class VowelorConsonantCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charter");
	     char ch=sc.next().charAt(0);	
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
        	 System.out.println("it is a Vowel") ;
          }else {
        	  System.out.println("it is a Consonant");
          }
	}

}
