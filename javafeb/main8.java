//Сафронов Дмитрий ДТН-309-0 8 задача
import java.util.Scanner;
public class main8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        int num = a, i = 1;
        while(i <= 10)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
        sc.close();
    }
}
