
import java.io.*;
import java.nio.file.*;
import java.util.List;

public class Util {
    public static void save(String path, List<Car> cars) {
        try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
            for (Car c : cars)
                out.println(c.toFileLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String read(String path) {
        try {
            if (!Files.exists(Path.of(path)))
                return "(Fails nav atrasts vai izveidots)";
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            return "(Problēmas ar failu)";
        }
    }
}
