//Сафронов Дмитрий ДТН-309-0 20 задача
import java.util.Scanner;
import java.util.Random;
public class main20 {
    public static void main(String[] args) {
        Random random = new Random();
        int numberrandom = random.nextInt(100) + 1;
        int Tries = 0;
        boolean GuessedCorrectly = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Угадайте число от 1 до 100");

        while (!GuessedCorrectly) {
            System.out.print("Введите ваше число: ");
            int userGuess = scanner.nextInt();
            Tries++;

            if (userGuess < numberrandom) {
                System.out.println("Слишком маленькое число, попробуйте еще раз.");
            } else if (userGuess > numberrandom) {
                System.out.println("Слишком большое число, попробуйте снова.");
            } else {
                GuessedCorrectly = true;
                System.out.println("Поздравляем! Вы угадали число " + numberrandom + " за " + Tries + " попыток.");

            }
        }
    }
}

