//Сафронов Дмитрий ДТН-309-0 27 задача
import java.util.Scanner;
public class main27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.print("Введите количество позиций для поворота: ");
        int k = sc.nextInt();
        rotateArray(array, k);
        System.out.println("Массив после поворота:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    public static void rotateArray(int[] array, int k) {
        int n = array.length;
        k = k % n;

        // Поворот массива
        reverse(array, 0, n - 1);
        reverse(array, 0, k - 1);
        reverse(array, k, n - 1);
    }

    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
