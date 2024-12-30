package school.lesson2;
import java.util.Scanner;


public class isLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        if (!scanner.hasNextInt()) {
            System.out.println("U can enter only number-values");
            return;
        }
        int year = scanner.nextInt();

        System.out.println(isALeapYear(year));
    }

    public static boolean isALeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}