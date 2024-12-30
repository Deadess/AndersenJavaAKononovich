package school.lesson2;
import java.util.Scanner;


public class isInRange {

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("U can enter only number-values");
            return;
        }
        int a = scanner.nextInt();

        System.out.print("Enter 2nd number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("U can enter only number-values");
            return;
        }
        int b = scanner.nextInt();

        System.out.println(isSumInRange(a, b));
    }
}
