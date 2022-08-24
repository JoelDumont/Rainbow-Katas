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

    public int countNrOfIncreases(final String... strings) {
        Integer[] ints = new Integer[strings.length];
        for (int i = 0; i < strings.length; i += 1) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        return countNrOfIncreases(ints);
    }

    public boolean isValueIncreasing(final String s1, final String s2) {
        return isValueIncreasing(Integer.parseInt(s1), Integer.parseInt(s2));
    }

    public boolean isValueIncreasing(int i1, int i2) {
        return i1 < i2;
    }

    public int countNrOfIncreases(Integer... ints) {
        int summe = 0;
        for (int i = 1; i < ints.length; i += 1) {
            if (isValueIncreasing(ints[i - 1], ints[i])) {
                summe++;
            }
        }
        return summe;
    }
}
