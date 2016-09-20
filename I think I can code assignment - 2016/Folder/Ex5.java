import java.util.Scanner;

public class Ex5 {

  public static int divide(double a, double b){
    return (int) (a/b);


  }
  public static int divideround(double a , double b) {

    return (int) (Math.round(a / b)) ;
  }

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("Type in two doubles and I'll divide it and give you an integer");



    double a = in.nextDouble();

    double b = in.nextDouble();

    System.out.println(divide(a,b));



  }
}
