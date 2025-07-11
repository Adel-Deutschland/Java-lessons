import java.util.Scanner;
public class PasswordCheck {
  public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.print("Vvedite parol: ");
    String password = scanner.nextLine();

    if (!password.equals("java123")) {
      System.out.println("Neverniy parol, dostup zapreshen");
    } else {
      System.out.println("Verniy parol! Dobro pojalovat.");
    }
    scanner.close();
  }
}