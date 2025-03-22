//Сафронов Дмитрий ДТН-309-0 12 задача
import java.util.Scanner;
public class main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
       int n = sc.nextInt();
        if (isPalindrome(n)) {
            System.out.println(n + " является палиндромом.");
        } else {
            System.out.println(n + " не является палиндромом.");
        }
        sc.close();

        }
    public static boolean isPalindrome(int n) {
        int origNumber = n;
        int notorigNumber = 0;
        while (n != 0) {
            int digit = n % 10;
            notorigNumber = notorigNumber * 10 + digit;
            n = n / 10;
        }
        return origNumber == notorigNumber;
    }
    }
