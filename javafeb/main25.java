//Сафронов Дмитрий ДТН-309-0 25 задача
import java.util.Scanner;
import java.util.Random;
public class main25 {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int triesLeft = 10;
        Scanner sc = new Scanner(System.in);

        System.out.println("Угадайте число от 1 до 100. У вас есть 10 попыток.");

        while (triesLeft > 0) {
            System.out.print("Введите ваше число: ");
            int userGuess = sc.nextInt();
            triesLeft--;

            if (userGuess == numberToGuess) {
                System.out.println("Поздравляем! Вы угадали число!");
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Слишком маленькое число, попробуйте еще раз.");
            } else {
                System.out.println("Слишком большое число, попробуйте снова.");
            }

            System.out.println("У вас осталось " + triesLeft + " попыток.");
        }

        if (triesLeft == 0) {
            System.out.println("К сожалению, у вас закончились попытки ;( . Загаданное число было " + numberToGuess);
        }

        sc.close();
    }
}
