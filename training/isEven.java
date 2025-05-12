import java.util.Scanner;

public class isEven {
  public static void main(String[] args) {
    Scanner scanner =new Scanner (System.in);
    int number = 8;
    boolean isEven =number % 2== 0;

    if (isEven) {
      System.out.println("Chetnoye chislo");
    }
    else {
      System.out.println("Chislo nechetnoye");
    }
  }
}