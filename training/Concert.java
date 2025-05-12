import java.util.Scanner;

public class Concert {
  public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);
    int age =40;

    if (age >= 18 && age <= 30) {
      System.out.println("Dobro pojalovat na konzert");
    }
    else {
      System.out.println("Izvinite, vhod zapreshen");
    }
    }}