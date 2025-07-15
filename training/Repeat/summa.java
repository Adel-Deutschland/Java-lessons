import java.util.Scanner;

public class summa {
  public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);
    int number;
    int sum =0;

    do {
      System.out.print ("Vvedite chislo (0 - dlya zaversheniya): ");
      number = scanner.nextInt();
      sum += number;
    } while (number != 0);

    System.out.println("Summa vseh chisel: " + sum);
    scanner.close();
  }
}
