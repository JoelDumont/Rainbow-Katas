package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    final Path path;

    public FileReader(final String pathToFile) {
        path = Paths.get(pathToFile);
    }

    public ArrayList<String> readLines(int nrOfLines) {
        try (final BufferedReader reader = Files.newBufferedReader(path)) {
            final ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < nrOfLines; i++) {
                list.add(reader.readLine());
            }
            return list;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> readAllLines() {
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
