package day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Sonar {
    final String pathToFile;

    public Sonar(final String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public ArrayList<String> readLines(int nrOfLines) {
        try (final BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
            final ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < nrOfLines; i++) {
                list.add(reader.readLine());
            }
            return list;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
