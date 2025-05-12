import java.util.Scanner;

public class isAdult {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int age = 20;
    boolean isAdult = age >= 18;

    if (isAdult) {
      System.out.println("Vi sovershennoletniy");
    }
    else {
      System.out.println("Vi nesovershennoletniy");
    }


  }
}