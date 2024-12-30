package school.lesson2;
import java.util.Scanner;


public class arrayIndexSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter 10 digits (0 or 1):");
        for (int i = 0; i < array.length; i++) {
            if (!scanner.hasNextInt()) {
                System.out.println("U can enter only number-values");
                return;
            }
            array[i] = scanner.nextInt();
            if (array[i] != 0 && array[i] != 1) {
                System.out.println("U can enter only 0 or 1 digits");
                return;
            }
        }
        invertArray(array);
        System.out.println("Inverse array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 0 ? 1 : 0;
        }
    }
}