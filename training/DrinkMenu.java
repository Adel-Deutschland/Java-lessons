import java.util.Scanner;

public class DrinkMenu {
  public static void main (String[] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Viberite napitok:");
    System.out.println("1 - Chay");
    System.out.println("2 - Kofe");
    System.out.println("3 - Sok");

    
    int choice = scanner.nextInt();

    switch (choice) {
      case 1:
        System.out.println("Vi vibrali chay.");
        break;
      case 2:
        System.out.println("Vi vibrali kofe.");
        break;
      case 3:
        System.out.println("Vi vibrali sok.");
        break;
      default:
        System.out.println("Takogo napitka net v menu");  
    }
    scanner.close();
  }}