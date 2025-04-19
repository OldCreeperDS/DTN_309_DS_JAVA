//Сафронов Дмитрий ДТН-309-0 1 задача
import java.util.Scanner;
public class unit1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s = sc.nextLine();
        System.out.println("Введите целое число:");
        double N = sc.nextInt();
        if (N == 0) {
            System.out.println();
        } else {
            if (N <= 0) {
                System.out.println("Ошибка, данное действие не возможно");
            } else {
                for (int i = 0; i < N; i++) {
                    System.out.println(s);
                }
            }


            sc.close();
        }
    }
}