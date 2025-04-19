//Сафронов Дмитрий ДТН-309-0 5 задача
import java.util.Arrays;
import java.util.Scanner;
public class unit5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку состоящие из нескольки слов:");
        String word = sc.nextLine();
        String[] split = word.split(" ");
        String result = "";
        for (int i = split.length - 1; i >= 0; i--) {
            result += (split[i] + " ");
        }
        System.out.println(result.trim());
        sc.close();
    }

        }


