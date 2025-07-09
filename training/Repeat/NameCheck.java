import java.util.Scanner; 
public class NameCheck {
  public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.print("Vvedite vashe imya: ");
    String name= scanner.nextLine();

    if (!name.equals("Adolya")) {
      System.out.println ("Vi ne Adolya,dostup zapreshen.");
    } else {
      System.out.println("Vi Adolya! Dobro pojalovat.");
    }

    scanner.close();
  }
}