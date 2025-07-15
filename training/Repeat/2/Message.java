import java.util.Scanner;

public class Message {
  public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);
    String message ="";

    while (!message.equals ("stop")) {
      System.out.print ("Soobsheniye: ");
      message = scanner.nextLine();

      if (!message.equals ("stop")) {
        System.out.println("Vi skazali: " + message);
      }
    }
    System.out.println ("Do svidaniya!");
    scanner.close();
  }
}
