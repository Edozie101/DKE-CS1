public class Testing {

  public static void main(String[] args) {
    long a = 10;
    int b = (int) a; // narrowing conversion explicit

    System.out.println(a);
    System.out.println(b);

    byte e = 3;
    int d =  e ; // widening conversion automatic
    System.out.println(d);

    System.out.println("I am the first adder method");
    add(1,3,5);
    add(1,3.9,6);

    


  }

  public static int add ( int a , int b , int c) {
    System.out.println(" Im an Int adder ");
    return a + b + c ;

  }

  public static int add( double a , double b, double c) {

    System.out.println("Im am the double adder");
    return (int) (a + b + c );
  }
  public static int add( int  a , double b, int  c) {

    System.out.println("Im am the mixed  adder");
    return (int) (a + b + c );
  }

}
