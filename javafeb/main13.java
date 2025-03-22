//Сафронов Дмитрий ДТН-309-0 13 задача
import java.util.Scanner;
public class main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        double n = sc.nextDouble();

        if (n < 0) {
            System.out.println("Ошибка: введено отрицательное число.");
        } else {

            double squareRoot = Math.sqrt(n);
            System.out.printf("Квадратный корень из " +n+ " равен " + squareRoot);
        }
            sc.close();
        }


    }


