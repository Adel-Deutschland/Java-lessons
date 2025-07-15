import java.util.Scanner;

public class tries {
  public static void main (String [] args) {
    Scanner scanner= new Scanner (System.in);
    String answer = "";
    int tries = 0;

    while (!answer.equals ("da")) {
      System.out.print ("Vi soglasni?");
      answer = scanner.nextLine();
      tries ++;
    }
    System.out.println("Ponadobilos popitok: " +tries);
    scanner.close();
  }
}
