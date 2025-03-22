//Сафронов Дмитрий ДТН-309-0 5 задача
import java.util.Scanner;
public class main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        if ((a & 1) == 0) {
            System.out.println("четное");
        } else {
            System.out.println("нечетное");
        }
        sc.close();
    }
}
