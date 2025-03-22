//Сафронов Дмитрий ДТН-309-0 15 задача
import java.util.Scanner;
public class main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;

            System.out.println("Перевернутое число: " + reversed);
            sc.close();
        }
    }
}

