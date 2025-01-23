package school.lesson7;

public class Main {
    public static void main(String[] args) {
        AppData data = new AppData();
        data.setHeader(new String[]{"Value 1", "Value 2", "Value 3"});
        data.setData(new int[][]{
                {100, 200, 123},
                {300, 400, 600}
        });
        CsvWriter writer = new CsvWriter();
        writer.save(data, "data.csv");
        CsvReader reader = new CsvReader();
        AppData loadedData = reader.load("data.csv");
        System.out.println("Header:");
        for (String header : loadedData.getHeader()) {
            System.out.print(header + " ");
        }
        System.out.println("\nData:");
        for (int[] row : loadedData.getData()) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}