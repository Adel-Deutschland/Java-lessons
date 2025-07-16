import java.util.Scanner;

public class DayofWeek {
  public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println ("Viberite den nedeli:");
    System.out.println("1 → Ponedelnik");
    System.out.println("2 → Vtornik");
    System.out.println("3 → Sreda");
    System.out.println("4 → Chetverg");
    System.out.println("5 → Pyatniza");
    System.out.println("6 → Subbota");
    System.out.println("7 → Voskresenye");

    int choice = scanner.nextInt();

    switch (choice) {
      case 1:
      System.out.println ("Vi vibrali Ponedelnik.");
      break;
      case 2:
      System.out.println ("Vi vibrali Vtornik.");
      break;
      case 3:
      System.out.println ("Vi vibrali Sreda.");
      break;
      case 4:
      System.out.println ("Vi vibrali Chetverg.");
      break;
      case 5:
      System.out.println ("Vi vibrali Pyatniza.");
      break;
      case 6:
      System.out.println ("Vi vibrali Subbota.");
      break;
      case 7:
      System.out.println ("Vi vibrali Voskresenya.");
      break;
      default:
      System.out.println("Takogo dnya net.");
    }
  }
}
