import java.util.Scanner;

public class ChoseDrink {
  public static void main (String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.print("Viberite napitok(Chay, Kofe, Sok): ");
    String drink = scanner.nextLine();

    switch (drink) {
      case "Chay":
        System.out.println("Chay");
        break;
        case "Kofe":
          System.out.println("Kofe");
          break;
          case "Sok":
            System.out.println("Sok");
            break;
            default:
              System.out.println("Takogo napitka net v menyu");
    }

  }
}