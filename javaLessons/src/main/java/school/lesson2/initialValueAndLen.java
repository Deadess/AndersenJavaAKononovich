package school.lesson2;
import java.util.Scanner;

public class initialValueAndLen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter len: ");
        if (!scanner.hasNextInt()) {
            System.out.println("U can enter only number-values");
            return;
        }
        int len = scanner.nextInt();
        System.out.print("Enter initialValue: ");
        if (!scanner.hasNextInt()) {
            System.out.println("U can enter only number-values");
            return;
        }
        int initialValue = scanner.nextInt();
        int[] array = createArray(len, initialValue);
        System.out.println("Created array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}