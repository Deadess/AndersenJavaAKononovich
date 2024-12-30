package school.lesson2;
import java.util.Scanner;


public class arrayFill {
    public static void main(String[] args) {
        int[] array = new int[100];
        fillArray(array);

        System.out.println("Filled array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }
}