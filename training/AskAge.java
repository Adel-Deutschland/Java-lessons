import java.util.Scanner;

public class AskAge {
  public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);

    while (age <= 18) {
      System.out.print("Vvedite vozrast: ");
      age = scanner.nextInt();

      if (age <= 18) {
        System.out.println("Vozrast doljen bit bolshe 18. Poprobuyte eshe raz.")
      }
    }

    System.out.println("Spasibo! Vash vozrast: " + age);
  }
}