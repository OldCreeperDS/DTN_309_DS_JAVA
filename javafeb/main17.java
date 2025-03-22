//Сафронов Дмитрий ДТН-309-0 17 задача
import java.util.Scanner;
public class main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 2 числа: ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double nod = findNOD(a, b);
        System.out.println("НОД чисел " + a + " и " + b + " равен: " + nod);
        sc.close();
    }
        public static double findNOD(double a, double b) {
            while (b != 0) {
                double temp = b;
                b = a % b;
                a = temp;
            }
            return a;
    }
}
