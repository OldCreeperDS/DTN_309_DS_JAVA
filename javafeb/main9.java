//Сафронов Дмитрий ДТН-309-0 9 задача
import java.util.Scanner;
public class main9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        System.out.println(Integer.toBinaryString(a));
        sc.close();

    }
}


