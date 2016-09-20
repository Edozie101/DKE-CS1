import java.util.Scanner;
import java.util.*;

public class MaxAndMin {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);

    	int n1 = in.nextInt();
    	int n2 = in.nextInt();
    	int n3 = in.nextInt();
      int n4 = in.nextInt();
      int n5 = in.nextInt();

    	int max = maxOf3(n1,n2,n3);
    	System.out.println("Maximum of first 3: " + max);

    	System.out.println("Minimum of first 3: " + minOf3(n1,n2,n3));

      System.out.println("Maximum of all 5: " + maxOf5(n1,n2,n3,n4,n5));
      System.out.println("Minimum of all 5: " + minOf5(n1,n2,n3,n4,n5));

    }

    public static int minOf5(int r, int s, int t, int u, int v) {

      ArrayList<Integer> three = new ArrayList<Integer>();

      three.add(r);
      three.add(s);
      three.add(t);
      three.add(u);
      three.add(v);

      Collections.sort(three);

      return three.get(0);
    }

    public static int maxOf5(int r, int s, int t, int u, int v) {

      ArrayList<Integer> three = new ArrayList<Integer>();

      three.add(r);
      three.add(s);
      three.add(t);
      three.add(u);
      three.add(v);

      Collections.sort(three);
        return three.get(4);
    }

    public static int maxOf3(int r, int s, int t) {

      ArrayList<Integer> three = new ArrayList<Integer>();

      three.add(r);
      three.add(s);
      three.add(t);

      Collections.sort(three);

      return three.get(2);
    }

    public static int minOf3(int r, int s, int t) {

      ArrayList<Integer> three = new ArrayList<Integer>();

      three.add(r);
      three.add(s);
      three.add(t);

      Collections.sort(three);

      return three.get(0);
    }


}
