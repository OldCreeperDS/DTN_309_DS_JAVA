//Сафронов Дмитрий ДТН-309-0 21 задача
import java.util.Scanner;
import java.util.InputMismatchException;
public class main21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Введите количество строк первой матрицы: ");
            int rowsA = sc.nextInt();
            System.out.print("Введите количество столбцов первой матрицы: ");
            int colsA = sc.nextInt();

            System.out.print("Введите количество строк второй матрицы: ");
            int rowsB = sc.nextInt();
            System.out.print("Введите количество столбцов второй матрицы: ");
            int colsB = sc.nextInt();

            if (colsA != rowsB) {
                System.out.println("Ошибка: Невозможно умножить матрицы. Количество столбцов первой матрицы должно быть равно количеству строк второй матрицы.");
                return;
            }

            int[][] matrixA = new int[rowsA][colsA];
            int[][] matrixB = new int[rowsB][colsB];
            int[][] resultMatrix = new int[rowsA][colsB];

            System.out.println("Введите элементы первой матрицы:");
            fillMatrix(sc, matrixA);

            System.out.println("Введите элементы второй матрицы:");
            fillMatrix(sc, matrixB);

            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    for (int k = 0; k < colsA; k++) {
                        resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }

            System.out.println("Результат умножения матриц:");
            printMatrix(resultMatrix);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода. Пожалуйста, введите целые числа.");

            sc.close();
        }
    }

    private static void fillMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                while (true) {
                    try {
                        System.out.printf("Введите элемент [%d][%d]: ", i + 1, j + 1);
                        matrix[i][j] = scanner.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Ошибка ввода. Пожалуйста, введите целое число.");
                        scanner.next();
                    }
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}