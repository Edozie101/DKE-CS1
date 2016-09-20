import java.util.Scanner;

public class ex3 {


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("How big do you want your dice to go up to  ");
    int dice = in.nextInt();
    double roll = Math.random() * (dice + 1);
    System.out.println("The number you rolled is : " + (int) (Math.floor(roll)));
  }
}
