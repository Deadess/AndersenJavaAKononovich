package school.lesson2;
import java.util.Scanner;

public class arrayMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        if (!scanner.hasNextInt()) {
            System.out.println("U can enter only number-values");
            return;
        }
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        }
        for (int i = 0; i < size; i++) {
            matrix[i][size - 1 - i] = 1;
        }
        System.out.println("Matrix with filled diagonals:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}