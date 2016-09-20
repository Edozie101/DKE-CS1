import java.util.Scanner;
public class ex0 {
  Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Give me a number ");
    int a = in.nextInt();
    if (a % 2 == 0) {
      System.out.println("This is an even number ")

    }
    else {
      System.out.println("This is an odd number  ")

    }



  }
}
