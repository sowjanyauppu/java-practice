//Grade Calculator: Create an application that takes a student's test scores and calculates their final grade. Use conditional statements to determine the letter grade (e.g. A, B, C, etc.) based on their scores.

import java.util.Scanner;
public class Gradecalcutor {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the marks");
      int marks=sc.nextInt();
      if(marks>85){
          System.out.println("Grade A");
      }else if(marks>75 && marks<85 ){
          System.out.println("Grade B");
      }else if(marks>55 && marks<75 ){
          System.out.println("Grade c");
      }else{
          System.out.println("fail");
      }
    }
}