//Сафронов Дмитрий ДТН-309-0 3 задача
import java.util.Scanner;
public class unit3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String N = sc.nextLine();
        String result = replaceN(N);
        System.out.println("Результат: " + result);
        sc.close();
    }
    public static String replaceN(String N) {
        N = N.replace("1", " один ");
        N = N.replace("2", " два ");
        N = N.replace("3", " три ");
        return N;

    }

}