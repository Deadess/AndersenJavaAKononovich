package school.lesson2;
import java.util.Scanner;


public class stringXTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter x-multiplier: ");
        if (!scanner.hasNextInt()) {
            System.out.println("U can enter only number-values");
            return;
        }
        int times = scanner.nextInt();

        printStringMultipleTimes(str, times);
    }

    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }
}