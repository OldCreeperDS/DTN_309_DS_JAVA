//Сафронов Дмитрий ДТН-309-0 7 задача
import java.util.Scanner;
public class main7 {

    static int var = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = sc.nextInt();
        foundNatural(n);
    }
    private static void  foundNatural(int n) {
        if (n > 1) {
            if (n % var != 0) {
                var++;
                foundNatural(n);
            } else if (n % var == 0) {
                printNatural(var, n);
            }
        }
    }
    private static void printNatural(int var, int n) {
        if (var == n) {
            System.out.println(n + " это простое число.");
        } else {
            System.out.println(n + " это не простое число.");
        }
    }

}