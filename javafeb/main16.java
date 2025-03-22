//Сафронов Дмитрий ДТН-309-0 16 задача
import java.util.Scanner;
public class main16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        double n = sc.nextInt();

        if (PerfectNumber(n)) {
            System.out.println(n + " является совершенным числом.");
        } else {
            System.out.println(n + " не является совершенным числом.");
        }
    }

    public static boolean PerfectNumber(double n) {
        if (n <= 1) {
            return false;
        }

        double sum = 1;
        for (double i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        return sum == n;
    }
}

