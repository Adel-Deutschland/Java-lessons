import java.util.Scanner;

public class WeekdaySwitch {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Vvedite nomer dnya nedeli (1-7): ");
    int day =scanner.nextInt();

    switch (day) {
      case 1:
        System.out.println("Ponedelnik");
        break;
        case 2:
          System.out.println("Vtornik");
          break;
          case 3:
            System.out.println("Sreda");
            break;
            case 4:
              System.out.println("Chetverg");
              break;
              case 5:
                System.out.println("Patniza");
                break;
                case 6:
                  System.out.println("Subbota");
                  break;
                  case 7:
                    System.out.println("Voskresenye");
                    break;
                    default:
                      System.out.println("Net takogo dnya nedeli.");
    }
  }
}