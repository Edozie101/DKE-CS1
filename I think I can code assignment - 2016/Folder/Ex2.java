import java.util.Scanner;
public class Ex2 {

  public static double clockrate() {

    Scanner in = new Scanner(System.in);

    System.out.println("What is your clockrate in ghz");

    double yourspeed = in.nextDouble();

    return yourspeed * Math.pow(10,9);


  }

  public static void main(String[] args) {


    double yourspeed = clockrate();
    System.out.println("Hello " + " Your speed is  " + yourspeed + " Hz");

    // Speed of light Km per second
    double speedolight = 29979.458;


    // one cycle in a fraction of a second
    double secfrac = 1 / yourspeed;

    // the distance per one cycle
    double distance = speedolight * secfrac;

    System.out.println("This means that in one cycle of your processor, light would have travelled " + (distance * 100000) + " centimeters");




  }
}
