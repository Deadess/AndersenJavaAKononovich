package school.lesson2;
import java.util.Scanner;
public class plusOrMinus {

    public static void isPosOrNeg(int number) {
        if (number >= 0) {
            System.out.println("Num is positive");
        } else {
            System.out.println("Num is negavite");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("U can enter only number-values");
            return;
        }
        int number = scanner.nextInt();

        isPosOrNeg(number);
    }
}
