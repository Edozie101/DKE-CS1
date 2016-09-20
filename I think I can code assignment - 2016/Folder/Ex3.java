import java.util.Scanner;

public class Ex3 {



  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);



    System.out.println("Hey can you put in an  integer please?");
    int a = in.nextInt();
    System.out.println("Hey can you put in the next integer please?");
    // Input the next integer
    int b = in.nextInt();

    System.out.println("Here is the first variable after switching : " + a );
    System.out.println("Here is the second variable after switching : " + b);

    int c = a;
    a = b;
    b = c;

    System.out.println("Here is the first variable after switching : " + a );
    System.out.println("Here is the second variable after switching: " + b);

  }
}
