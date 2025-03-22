//Сафронов Дмитрий ДТН-309-0 10 задача
import java.util.Scanner;
import static java.lang.Math.max;
public class main10{
    public static void main(String[] args) {double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 3 числа: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Самое максимальное число: " + max(max(a, b), c));
        sc.close();
    }
}

