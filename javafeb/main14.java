//Сафронов Дмитрий ДТН-309-0 14 задача
import java.util.Scanner;
public class main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        double n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Сумма цифр числа: " + sum);
        sc.close();
    }
}

