package day5;
import java.util.Scanner;
public class VoweConsonantCheck {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the charter");
	char ch=sc.next().charAt(0);
	VoweConsonantCheck vc=new VoweConsonantCheck();
	int result =vc.VoweConsonant(ch);
	if(result==1) {
	System.out.println("it is a Vowel") ;
    }else {
  	System.out.println("it is a Consonant");
    }
	}
	public int VoweConsonant(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
       	 return 1 ;
         }else {
       	  return 0;
         }
	}

}
