import java.util.Scanner;

public class Password {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String password ="";

    while (!password.equals ("java123")) {
      System.out.print("VVedite parol: ");
      password = scanner.nextLine();

      if (!password.equals("java123")) {
        System.out.println("Neverniy parol. Poprobuyte eshe raz.");
      }
    }
    System.out.println("Dostup razreshen!");
  }
}