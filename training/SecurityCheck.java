import java.util.Scanner;

public class SecurityCheck {
  public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);
    boolean hasPass = false;
    int age = 17;
    boolean isEmployee = true;
    boolean isBanned = false;


      if (hasPass && (age < 18 || isEmployee ) && !isBanned) {
        System.out.println("Prohod razreshen");
      } else {
        System.out.println("Vhod zapreshen");
      }
    }
  }
