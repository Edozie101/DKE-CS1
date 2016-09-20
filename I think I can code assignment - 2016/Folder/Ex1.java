import java.util.Scanner;

 public class Ex1 {


  public static double area (int  height , int width ) {
    return  height * width * 0.5 ;

  }



  public static void main(String[] args) {

    // Initialized the scanner to read the command line
    Scanner in = new Scanner(System.in);


    // Tell the user what you want to do
    System.out.println("Please type the width");

    //collect the input
    int width = in.nextInt();


    //Tell the user what you want
    System.out.println("Please type the height");

    //collect the height
    int height = in.nextInt();

    //print it out
    System.out.println("The area of your triangle is " + area(height,width) );







  }


}
