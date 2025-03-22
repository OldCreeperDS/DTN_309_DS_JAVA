//Сафронов Дмитрий ДТН-309-0 11 задача
import java.util.Scanner;
public class main11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        double n = sc.nextInt();
        double sum = 1;
        for (double i = 1; i <= n; i++)
            sum = sum + i;
        System.out.println(sum);
        sc.close();

        }

    }