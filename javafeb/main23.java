//Сафронов Дмитрий ДТН-309-0 23 задача
import java.util.Scanner;
import java.util.InputMismatchException;
public class main23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ns;

        try {
            System.out.print("Введите количество чисел для сортировки: ");
            int n = sc.nextInt();
            ns = new int[n];

            System.out.println("Введите " + n + " целых чисел:");
            for (int i = 0; i < n; i++) {
                ns[i] = sc.nextInt();
            }

            bubbleSort(ns);

            System.out.println("Отсортированный массив:");
            for (int number : ns) {
                System.out.print(number + " ");
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода. Пожалуйста, введите целые числа.");
        } finally {
            sc.close();
        }
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
