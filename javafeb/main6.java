//Сафронов Дмитрий ДТН-309-0 6 задача
import java.util.Scanner;

public class main6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        double a = sc.nextInt();
        double factorial = 1;
        for (double i = 1; i <= a; i++) {
            factorial *= i;
            System.out.println("Факториал числа " + a + " равен " + factorial);

        }

        sc.close();

    }
}
