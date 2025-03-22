//Сафронов Дмитрий ДТН-309-0 22 задача
import java.util.Scanner;
import java.util.InputMismatchException;
public class main22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Введите количество чисел Фибоначчи для генерации: ");
            int n = sc.nextInt();

            if (n < 1) {
                System.out.println("Ошибка: Значение N должно быть положительным.");
            } else {
                System.out.println("Первые " + n + " чисел Фибоначчи:");
                generateFibonacci(n);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода. Пожалуйста, введите целое число.");
        } finally {
            sc.close();
        }
    }

    private static void generateFibonacci(int n) {
        int first = 0, second = 1;

        if (n >= 1) {
            System.out.print(first + " ");
        }
        if (n >= 2) {
            System.out.print(second + " ");
        }

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }

    }
}