import java.util.Scanner;
public class ex1 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Give me a number ");
    int a = in.nextInt();
    double b = Math.random();
    System.out.println("This is the random number " + b);
    if (a % 2 == 0) {
        if(b  < 0.9 ) {
        System.out.println("This is an even number ");
        }
        else {
        System.out.println("This is an odd number");
      }


    }
    else {
      if (b < 0.9) {
      System.out.println("This is an odd number  ");
      }
      else {
      System.out.println(" this is an even number");

      }
    }



  }
}
