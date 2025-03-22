//Сафронов Дмитрий ДТН-309-0 24 задача
import java.util.Scanner;
import java.util.InputMismatchException;
public class main24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double firstTerm, difference;

        try {
            System.out.print("Введите первый член арифметической прогрессии: ");
            firstTerm = sc.nextDouble();

            System.out.print("Введите разность прогрессии: ");
            difference = sc.nextDouble();

            System.out.print("Введите количество членов (n): ");
            n = sc.nextInt();

            double sum = calculateSum(firstTerm, difference, n);
            System.out.println("Сумма первых " + n + " членов равна: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода. Пожалуйста, введите правильные значения.");

            sc.close();
        }
    }
    private static double calculateSum(double firstTerm, double difference, int n) {
        return n / 2.0 * (2 * firstTerm + (n - 1) * difference);
    }
}
