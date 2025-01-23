package school.lesson7;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWriter {
    public void save(AppData data, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String header : data.getHeader()) {
                writer.append(header).append(";");
            }
            writer.append("\n");
            for (int[] row : data.getData()) {
                for (int value : row) {
                    writer.append(String.valueOf(value)).append(";");
                }
                writer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
