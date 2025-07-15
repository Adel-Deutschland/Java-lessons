
public class SecurityCheck {
  public static void main (String[] args) {
    boolean hasPass =true;
    boolean isEmployee =true;
    int age = 21;

    while (!(hasPass && age >= 18 && isEmployee)) {
      System.out.println ("Vhod zapreshen. Proverka ne proydena");
      break;
    }
    if (hasPass && age >= 18 && isEmployee) {
      System.out.println ("Dostup razreshen");
  }
}
}
