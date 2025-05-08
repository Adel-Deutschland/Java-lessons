import java.util.Scanner;

public class AskAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;

        while (age <= 18) {
            System.out.print("Введите ваш возраст: ");
            age = scanner.nextInt();

            if (age <= 18) {
                System.out.println("Возраст должен быть больше 18. Попробуйте ещё раз.");
            }
        }

        System.out.println("Спасибо! Доступ разрешён.");
        scanner.close();
    }
}
