package school.lesson6;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "s"},
                {"13", "14", "15", "16"}
        };
        try {
            int result = ArrayProcessor.processArray(array);
            System.out.println("Sum: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Array size error: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Array data error: " + e.getMessage());
        }
    }
}