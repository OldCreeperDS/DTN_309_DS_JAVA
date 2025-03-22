//Сафронов Дмитрий ДТН-309-0 3 задача
import java.util.Scanner;

public class main3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double a = sc.nextInt();
        System.out.println("Введите второе число:");
        double b = sc.nextInt();
        System.out.println("Введите третье число:");
        double c = sc.nextInt();
        double g = a+b+c;
        System.out.println(g/3);

        sc.close();

    }
}