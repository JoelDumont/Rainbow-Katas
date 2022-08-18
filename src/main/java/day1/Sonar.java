package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Sonar {
    final String pathToFile;
    final Path path;

    public Sonar(final String pathToFile) {
        this.pathToFile = pathToFile;
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

    public boolean compareLines(String s1, String s2) {
        final int i1 = Integer.parseInt(s1);
        final int i2 = Integer.parseInt(s2);
        return Integer.compare(i1, i2) < 0;
    }
}
