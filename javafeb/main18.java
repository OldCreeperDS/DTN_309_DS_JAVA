//Сафронов Дмитрий ДТН-309-0 18 задача
import java.util.Scanner;
public class main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 2 числа: ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double min = Math.min(a, b);
        System.out.print("Меньшее двух чисел: " +min);
        sc.close();
    }
}