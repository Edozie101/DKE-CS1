import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

 class ex4 {

  public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<String>() ;
    boolean a = true;

  Scanner in = new Scanner(System.in);
    while (a == true){

      System.out.println("Enter in your words");
      System.out.println("Type stop if you want to stop\n");
      String word = in.nextLine();
      word.replace("\n", "");
      if (word.equals("stop")){
        a = false;
        break;
      }
      System.out.println( "This is the word : " + word);
      words.add(word);
    }
    Collections.sort(words);
    System.out.println("\n \n \n ");
    System.out.println("Here is in lexographical order");
    for(int i=0;i<words.size(); i++){
      System.out.println(words.get(i));
    }

  }

}
