//Rock Paper Scissors Program :  Create a simple game of rock-paper-scissors where the user plays against the computer. Use conditional statements to determine the winner of each round.
import java.util.Scanner;
public class Rockpaperssesare{
    public static void main (String args[]){
         Scanner sc=new Scanner(System.in);
        System.out.println("wellcome to rock paper sesares");
        System.out.println("player 1 enter the move(1=rok,2=paper,3=sesars):");
        int player1 =sc.nextInt();
     if(player1<1||player1>3)
     {
        System.out.println("Invalid move .plase enter valid move(1=rock,2=paper,3=sesar):");
        player1=sc.nextInt();
     }
      System.out.println("player 2 enter the move");
      int player2 =sc.nextInt();
     if(player2<1||player2>3)
     {
        System.out.println("Invalid move .plase enter valid move(1=rock,2=paper,3=sesar):");
        player2=sc.nextInt();
     }
      if(player1==player2)
     {
         System.out.println("tie");
     } else if((player1==1&& player2==3)|| (player1==2 && player2==2)||
     (player1==3&&player2==1))
     {
        System.out.println("player 1 win!");
     } else
     {
         System.out.println("player 2 win!");
     }
    }
}