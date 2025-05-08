import java.util.Scanner;


public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 7;
        int guess;

        System.out.println("Попробуй угадать число от 1 до 10:");

        // Цикл продолжается, пока пользователь не угадает число
        while (true) {
            guess = scanner.nextInt();
            if (guess == secretNumber) {
                System.out.println("Поздравляю, ты угадал!");
                break; // выход из цикла
            } else {
                System.out.println("Попробуй еще раз!");
            }
        }
    }
}
