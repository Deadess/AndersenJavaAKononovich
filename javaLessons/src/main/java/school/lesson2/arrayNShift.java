package school.lesson2;
import java.util.Scanner;


public class arrayNShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array's size: ");
        if (!scanner.hasNextInt()) {
            System.out.println("U can enter only number-values");
            return;
        }
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array's elements:");
        for (int i = 0; i < size; i++) {
            if (!scanner.hasNextInt()) {
                System.out.println("U can enter only number-values");
                return;
            }
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter n-shift value: ");
        if (!scanner.hasNextInt()) {
            System.out.println("U can enter only number-values");
            return;
        }
        int n = scanner.nextInt();
        shiftArray(array, n);
        System.out.println("Shifted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void shiftArray(int[] array, int n) {
        int length = array.length;
        n = n % length;
        if (n < 0) {
            n += length;
        }
        reverseArray(array, 0, length - 1);
        reverseArray(array, 0, n - 1);
        reverseArray(array, n, length - 1);
    }

    private static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}