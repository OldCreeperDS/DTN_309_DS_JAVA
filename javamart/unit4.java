//Сафронов Дмитрий ДТН-309-0 4 задача
import java.util.Scanner;
public class unit4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String N = sc.nextLine();
        sc.close();
        StringBuilder sb = new StringBuilder(N);
        removeEverySecondChar(sb);
        System.out.println("Результат: " + sb);
    }
    public static void removeEverySecondChar(StringBuilder sb) {

        for (int i = 1; i < sb.length(); i++) {
            sb.deleteCharAt(i);
        }
    }
}