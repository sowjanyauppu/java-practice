//Traffic Light Simulator: Create a simulation of traffic lights at a junction. Use conditional statements to change the lights based on the time of day and the traffic flow.
import java.util.Scanner;
public class TrafficLight {
    public static void main(String args[]) {
        String red,yellow,green;
      Scanner sc=new Scanner(System.in);
      System.out.println(" traffic light Simulation");
      System.out.println(" enter the hours in 24clock");
      int hours=sc.nextInt();
      if(hours>=6&&hours<12){
           System.out.println("green");
      }else if(hours>=12&&hours<22){
           System.out.println("green");
      }else if(hours>=22&&hours<1) {
          System.out.println("yellow");
      }else{
          System.out.println("red");
      }
      
    }
}