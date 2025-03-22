//Сафронов Дмитрий ДТН-309-0 26 задача
import java.util.Scanner;
public class main26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        while (n != 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            n = n / 10;
        }

        System.out.println("Количество четных цифр: " + evenCount);
        System.out.println("Количество нечетных цифр: " + oddCount);

        sc.close();
    }
}
