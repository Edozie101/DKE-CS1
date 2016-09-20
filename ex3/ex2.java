import java.util.Scanner;
public class ex2 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Give me a number below 20 ");
    int a = in.nextInt();
    double b = Math.random();
    int k = 2;
    int result = 0;
    if (a < 20) {
      System.out.println("Im double checking whether or not this is actually a prime hold onn.... ");
        while (k <= a / 2){
          if (a % k == 0) {
            result = 1;
          }
          k++;
        }
    }
    else {
      System.out.println("Enter the right number..");
    }
    if (result == 0){
      System.out.println("Its true you entered a prime number");

    }
    else{
      System.out.println("Nooooooo. Its not a prime number");
    }
  }
}
