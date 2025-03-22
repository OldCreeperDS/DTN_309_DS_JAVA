//Сафронов Дмитрий ДТН-309-0 2 задача
import java.util.Scanner;

public class main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double a = sc.nextInt();
        System.out.println("Введите второе число:");
        double b = sc.nextInt();
        double c = a+b;
        System.out.println("Сумма = "+c);

        sc.close();

    }
}