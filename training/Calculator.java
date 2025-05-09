import java.util.Scanner;

public class Calculator {
  public static void main (String[] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.print("Vvedite pervoye chislo: ");
    double num1 = scanner.nextDouble();

    System.out.print("Vvedite operator (+, -, *, /) ");
    String operator = scanner.next();

    System.out.print("Vvedite vtoroye chislo: ");
    double num2 = scanner.nextDouble();

    switch (operator) {
      case "+":
        System.out.println("Rezultat: "+ (num1 + num2));
        break;
       case "-":
         System.out.println("Rezultat: "+ (num1 - num2));
         break;
       case "*":  
         System.out.println("Rezultat: "+ (num1 * num2));
         break;
       case "/":
        System.out.println("Rezultat: "+ (num1 / num2));
        break;
       default:
        System.out.println("Oshibka: neizvestniy operator.");   
    }

    scanner.close();


  }
}