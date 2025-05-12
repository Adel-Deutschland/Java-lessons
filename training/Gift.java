import java.util.Scanner;

public class Gift {
  public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);
    int age = 65;

   if (age < 12 || age > 60) {
    System.out.println("Vam polojen podarok");
   } else {
    System.out.println("Podarok ne predusmoren");
   }
  }
}