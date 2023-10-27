//Age Calculator  :  Create an application that takes a person's birthdate as input and calculates their current age. Use conditional statements to determine if they are a minor or an adult.
import java.util.Scanner;
public class Agecalcutor {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the age");
      int age=sc.nextInt();
      if(age>=18){
          System.out.println("he/she is adult");
      } else if(age<18){
          System.out.println("he/she is minior");
      } else {
          System.out.println("invalid age");
      }

    }
}