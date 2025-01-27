package school.lesson7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public AppData load(String fileName) {
        List<int[]> data = new ArrayList<>();
        String[] header = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            if (line != null) {
                header = line.split(";");
            }

            while ((line = reader.readLine()) != null) {
                String[] values = line.split(";");
                int[] intValues = new int[values.length];
                for (int i = 0; i < values.length; i++) {
                    intValues[i] = Integer.parseInt(values[i]);
                }
                data.add(intValues);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        AppData appData = new AppData();
        appData.setHeader(header);
        appData.setData(data.toArray(new int[0][]));
        return appData;
    }
}