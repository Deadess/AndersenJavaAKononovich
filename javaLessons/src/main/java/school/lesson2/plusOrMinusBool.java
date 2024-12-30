package school.lesson2;
import java.util.Scanner;


public class plusOrMinusBool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("U can enter only number-values");
            return;
        }
        int number = scanner.nextInt();
        System.out.println(isNegative(number));
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }
}